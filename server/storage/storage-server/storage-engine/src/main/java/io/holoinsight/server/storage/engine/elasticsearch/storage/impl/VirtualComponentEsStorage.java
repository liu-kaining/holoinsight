/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.storage.engine.elasticsearch.storage.impl;

import io.holoinsight.server.storage.common.model.query.VirtualComponent;
import io.holoinsight.server.storage.common.model.specification.sw.RequestType;
import io.holoinsight.server.storage.engine.model.EndpointRelationDO;
import io.holoinsight.server.storage.engine.model.ServiceRelationDO;
import io.holoinsight.server.storage.engine.storage.VirtualComponentStorage;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregator;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VirtualComponentEsStorage implements VirtualComponentStorage {

  @Autowired
  private RestHighLevelClient client;

  @Override
  public List<VirtualComponent> getComponentList(String tenant, String service, long startTime,
      long endTime, RequestType type, String sourceOrDest) throws IOException {
    BoolQueryBuilder queryBuilder =
        QueryBuilders.boolQuery().must(QueryBuilders.termQuery(ServiceRelationDO.TENANT, tenant))
            .must(QueryBuilders.termQuery(sourceOrDest + "_service_name", service))
            .must(QueryBuilders.termQuery(ServiceRelationDO.TYPE, type.name())).must(
                QueryBuilders.rangeQuery(ServiceRelationDO.START_TIME).gte(startTime).lte(endTime));

    SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
    sourceBuilder.size(1000);
    sourceBuilder.query(queryBuilder);
    sourceBuilder.aggregation(CommonBuilder.buildAgg(ServiceRelationDO.ENTITY_ID));

    SearchRequest searchRequest = new SearchRequest(ServiceRelationDO.INDEX_NAME);
    searchRequest.source(sourceBuilder);
    SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);

    return buildComponentList(response, sourceOrDest);
  }

  @Override
  public List<String> getTraceIds(String tenant, String service, String address, long startTime,
      long endTime) throws IOException {
    TermsAggregationBuilder aggregationBuilder = AggregationBuilders
        .terms(ServiceRelationDO.TRACE_ID).field(ServiceRelationDO.TRACE_ID).executionHint("map")
        .collectMode(Aggregator.SubAggCollectionMode.BREADTH_FIRST).size(1000);

    BoolQueryBuilder queryBuilder =
        QueryBuilders.boolQuery().must(QueryBuilders.termQuery(ServiceRelationDO.TENANT, tenant))
            .must(QueryBuilders.termQuery(ServiceRelationDO.DEST_SERVICE_NAME, address)).must(
                QueryBuilders.rangeQuery(ServiceRelationDO.START_TIME).gte(startTime).lte(endTime));
    if (!StringUtils.isEmpty(service)) {
      queryBuilder.must(QueryBuilders.termQuery(ServiceRelationDO.SOURCE_SERVICE_NAME, service));
    }

    SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
    sourceBuilder.size(1000);
    sourceBuilder.query(queryBuilder);
    sourceBuilder.aggregation(aggregationBuilder);

    SearchRequest searchRequest = new SearchRequest(ServiceRelationDO.INDEX_NAME);
    searchRequest.source(sourceBuilder);
    SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);

    List<String> traceIds = new ArrayList<>();
    Terms terms = response.getAggregations().get(ServiceRelationDO.TRACE_ID);

    for (Terms.Bucket bucket : terms.getBuckets()) {
      String traceId = bucket.getKey().toString();
      traceIds.add(traceId);
    }

    return traceIds;
  }

  private List<VirtualComponent> buildComponentList(SearchResponse response, String sourceOrDest) {
    List<VirtualComponent> result = new ArrayList<>();
    Terms terms = response.getAggregations().get(EndpointRelationDO.ENTITY_ID);
    for (Terms.Bucket bucket : terms.getBuckets()) {
      String entityId = bucket.getKey().toString();
      Terms componentTerm = bucket.getAggregations().get(ServiceRelationDO.COMPONENT);
      String component = componentTerm.getBuckets().get(0).getKey().toString();

      VirtualComponent db = new VirtualComponent();
      db.buildFromServiceRelation(entityId, component, sourceOrDest);
      db.setMetric(CommonBuilder.buildMetric(bucket));

      result.add(db);
    }

    return result;
  }
}

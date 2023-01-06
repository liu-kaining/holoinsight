/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataService.proto

package io.holoinsight.server.meta.proto.data;

public final class DataServiceProto {
  private DataServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_InsertOrUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_InsertOrUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_QueryDataByTableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_QueryDataByTableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_QueryDataByPkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_QueryDataByPkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_QueryDataByPksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_QueryDataByPksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_DeleteDataByExampleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_DeleteDataByExampleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_QueryDataByExampleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_QueryDataByExampleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_UpdateDataByExampleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_UpdateDataByExampleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_BatchDeleteByPkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_BatchDeleteByPkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_DataBaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_DataBaseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_QueryDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_QueryDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_QueryOneDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_QueryOneDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_DataHello_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_DataHello_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DataService.proto\022\tscheduler\"]\n\025Insert" +
      "OrUpdateRequest\022\021\n\ttableName\030\001 \001(\t\022\020\n\010ro" +
      "wsJson\030\002 \001(\t\022\017\n\007fromApp\030\003 \001(\t\022\016\n\006fromIp\030" +
      "\004 \001(\t\"M\n\027QueryDataByTableRequest\022\021\n\ttabl" +
      "eName\030\001 \001(\t\022\017\n\007fromApp\030\002 \001(\t\022\016\n\006fromIp\030\003" +
      " \001(\t\"Y\n\024QueryDataByPkRequest\022\021\n\ttableNam" +
      "e\030\001 \001(\t\022\r\n\005pkVal\030\002 \001(\t\022\017\n\007fromApp\030\003 \001(\t\022" +
      "\016\n\006fromIp\030\004 \001(\t\"_\n\025QueryDataByPksRequest" +
      "\022\021\n\ttableName\030\001 \001(\t\022\022\n\npkValsJson\030\002 \001(\t\022" +
      "\017\n\007fromApp\030\003 \001(\t\022\016\n\006fromIp\030\004 \001(\t\"e\n\032Dele",
      "teDataByExampleRequest\022\021\n\ttableName\030\001 \001(" +
      "\t\022\023\n\013exampleJson\030\002 \001(\t\022\017\n\007fromApp\030\003 \001(\t\022" +
      "\016\n\006fromIp\030\004 \001(\t\"d\n\031QueryDataByExampleReq" +
      "uest\022\021\n\ttableName\030\001 \001(\t\022\023\n\013exampleJson\030\002" +
      " \001(\t\022\017\n\007fromApp\030\003 \001(\t\022\016\n\006fromIp\030\004 \001(\t\"v\n" +
      "\032UpdateDataByExampleRequest\022\021\n\ttableName" +
      "\030\001 \001(\t\022\023\n\013exampleJson\030\002 \001(\t\022\017\n\007rowJson\030\003" +
      " \001(\t\022\017\n\007fromApp\030\004 \001(\t\022\016\n\006fromIp\030\005 \001(\t\"h\n" +
      "\026BatchDeleteByPkRequest\022\021\n\ttableName\030\001 \001" +
      "(\t\022\032\n\022primaryKeyValsJson\030\002 \001(\t\022\017\n\007fromAp",
      "p\030\003 \001(\t\022\016\n\006fromIp\030\004 \001(\t\"E\n\020DataBaseRespo" +
      "nse\022\017\n\007success\030\001 \001(\010\022\016\n\006errMsg\030\002 \001(\t\022\020\n\010" +
      "rowsJson\030\003 \001(\t\"F\n\021QueryDataResponse\022\017\n\007s" +
      "uccess\030\001 \001(\010\022\016\n\006errMsg\030\002 \001(\t\022\020\n\010rowsJson" +
      "\030\003 \001(\t\"H\n\024QueryOneDataResponse\022\017\n\007succes" +
      "s\030\001 \001(\010\022\016\n\006errMsg\030\002 \001(\t\022\017\n\007rowJson\030\003 \001(\t" +
      "\";\n\tDataHello\022\r\n\005count\030\001 \001(\005\022\017\n\007fromApp\030" +
      "\002 \001(\t\022\016\n\006fromIp\030\003 \001(\t2\201\n\n\013DataService\022Q\n" +
      "\016insertOrUpdate\022 .scheduler.InsertOrUpda" +
      "teRequest\032\033.scheduler.DataBaseResponse\"\000",
      "\022I\n\006insert\022 .scheduler.InsertOrUpdateReq" +
      "uest\032\033.scheduler.DataBaseResponse\"\000\022I\n\006u" +
      "pdate\022 .scheduler.InsertOrUpdateRequest\032" +
      "\033.scheduler.DataBaseResponse\"\000\022V\n\020queryD" +
      "ataByTable\022\".scheduler.QueryDataByTableR" +
      "equest\032\034.scheduler.QueryDataResponse\"\000\022S" +
      "\n\rqueryDataByPk\022\037.scheduler.QueryDataByP" +
      "kRequest\032\037.scheduler.QueryOneDataRespons" +
      "e\"\000\022R\n\016queryDataByPks\022 .scheduler.QueryD" +
      "ataByPksRequest\032\034.scheduler.QueryDataRes",
      "ponse\"\000\022^\n\026queryDataByTableStream\022\".sche" +
      "duler.QueryDataByTableRequest\032\034.schedule" +
      "r.QueryDataResponse\"\0000\001\022S\n\017batchDeleteBy" +
      "Pk\022!.scheduler.BatchDeleteByPkRequest\032\033." +
      "scheduler.DataBaseResponse\"\000\022W\n\017deleteBy" +
      "Example\022%.scheduler.DeleteDataByExampleR" +
      "equest\032\033.scheduler.DataBaseResponse\"\000\022V\n" +
      "\016deleteByRowMap\022%.scheduler.DeleteDataBy" +
      "ExampleRequest\032\033.scheduler.DataBaseRespo" +
      "nse\"\000\022W\n\017updateByExample\022%.scheduler.Upd",
      "ateDataByExampleRequest\032\033.scheduler.Data" +
      "BaseResponse\"\000\022V\n\016queryByExample\022$.sched" +
      "uler.QueryDataByExampleRequest\032\034.schedul" +
      "er.QueryDataResponse\"\000\022V\n\016fuzzyByExample" +
      "\022$.scheduler.QueryDataByExampleRequest\032\034" +
      ".scheduler.QueryDataResponse\"\000\022^\n\024queryB" +
      "yExampleStream\022$.scheduler.QueryDataByEx" +
      "ampleRequest\032\034.scheduler.QueryDataRespon" +
      "se\"\0000\001\0229\n\theartBeat\022\024.scheduler.DataHell" +
      "o\032\024.scheduler.DataHello\"\000B;\n%io.holoinsi",
      "ght.server.meta.proto.dataB\020DataServiceP" +
      "rotoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_scheduler_InsertOrUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_scheduler_InsertOrUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_InsertOrUpdateRequest_descriptor,
        new java.lang.String[] { "TableName", "RowsJson", "FromApp", "FromIp", });
    internal_static_scheduler_QueryDataByTableRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_scheduler_QueryDataByTableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_QueryDataByTableRequest_descriptor,
        new java.lang.String[] { "TableName", "FromApp", "FromIp", });
    internal_static_scheduler_QueryDataByPkRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_scheduler_QueryDataByPkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_QueryDataByPkRequest_descriptor,
        new java.lang.String[] { "TableName", "PkVal", "FromApp", "FromIp", });
    internal_static_scheduler_QueryDataByPksRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_scheduler_QueryDataByPksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_QueryDataByPksRequest_descriptor,
        new java.lang.String[] { "TableName", "PkValsJson", "FromApp", "FromIp", });
    internal_static_scheduler_DeleteDataByExampleRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_scheduler_DeleteDataByExampleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_DeleteDataByExampleRequest_descriptor,
        new java.lang.String[] { "TableName", "ExampleJson", "FromApp", "FromIp", });
    internal_static_scheduler_QueryDataByExampleRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_scheduler_QueryDataByExampleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_QueryDataByExampleRequest_descriptor,
        new java.lang.String[] { "TableName", "ExampleJson", "FromApp", "FromIp", });
    internal_static_scheduler_UpdateDataByExampleRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_scheduler_UpdateDataByExampleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_UpdateDataByExampleRequest_descriptor,
        new java.lang.String[] { "TableName", "ExampleJson", "RowJson", "FromApp", "FromIp", });
    internal_static_scheduler_BatchDeleteByPkRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_scheduler_BatchDeleteByPkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_BatchDeleteByPkRequest_descriptor,
        new java.lang.String[] { "TableName", "PrimaryKeyValsJson", "FromApp", "FromIp", });
    internal_static_scheduler_DataBaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_scheduler_DataBaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_DataBaseResponse_descriptor,
        new java.lang.String[] { "Success", "ErrMsg", "RowsJson", });
    internal_static_scheduler_QueryDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_scheduler_QueryDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_QueryDataResponse_descriptor,
        new java.lang.String[] { "Success", "ErrMsg", "RowsJson", });
    internal_static_scheduler_QueryOneDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_scheduler_QueryOneDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_QueryOneDataResponse_descriptor,
        new java.lang.String[] { "Success", "ErrMsg", "RowJson", });
    internal_static_scheduler_DataHello_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_scheduler_DataHello_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_DataHello_descriptor,
        new java.lang.String[] { "Count", "FromApp", "FromIp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
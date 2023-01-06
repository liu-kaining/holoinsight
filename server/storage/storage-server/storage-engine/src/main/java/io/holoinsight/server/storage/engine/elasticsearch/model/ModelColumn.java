/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.storage.engine.elasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jiwliu
 * @version : ModelColumn.java, v 0.1 2022年10月11日 15:30 wanpeng.xwp Exp $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelColumn {
    private String   name;
    private Class<?> type;
}
CREATE TABLE `dim_col_mapping` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dim_table` varchar(256) NOT NULL,
  `field` varchar(50) NOT NULL,
  `col` varchar(50) NOT NULL,
  `gmt_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_dim_field` (`dim_table`, `field`) ,
  UNIQUE KEY `uk_dim_col` (`dim_table`, `col`)
) AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4;


CREATE TABLE `dim_table` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `table_schema` longtext DEFAULT NULL,
  `online_status` tinyint(1) NOT NULL DEFAULT '0',
  `gmt_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_name` (`name`) ,
  KEY `index_status` (`online_status`)
) AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4;


CREATE TABLE `index_table` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dim_table` varchar(50) NOT NULL,
  `columns` varchar(500) NOT NULL,
  `ref_table` varchar(50) DEFAULT NULL COMMENT '引用表名, 仅外键',
  `index_type` varchar(50) NOT NULL DEFAULT 'COMMON',
  `gmt_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_col_table_type` (`columns`, `dim_table`, `index_type`) ,
  KEY `idx_table` (`dim_table`) ,
  KEY `idx_type` (`index_type`) ,
  KEY `idx_reftable` (`ref_table`) ,
  KEY `idx_table_type` (`dim_table`, `index_type`)
) AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4;


CREATE TABLE `dim_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dim_table` varchar(256) NOT NULL,
  `md5` varchar(512) NOT NULL,
  `col1` varchar(300) DEFAULT NULL COMMENT 'col1',
  `col2` varchar(300) DEFAULT NULL COMMENT 'col2',
  `col3` varchar(300) DEFAULT NULL COMMENT 'col3',
  `col4` varchar(300) DEFAULT NULL COMMENT 'col4',
  `col5` varchar(300) DEFAULT NULL COMMENT 'col5',
  `col6` varchar(300) DEFAULT NULL COMMENT 'col6',
  `col7` varchar(300) DEFAULT NULL COMMENT 'col7',
  `col8` varchar(300) DEFAULT NULL COMMENT 'col8',
  `col9` varchar(300) DEFAULT NULL COMMENT 'col9',
  `col10` varchar(300) DEFAULT NULL COMMENT 'col10',
  `col11` varchar(300) DEFAULT NULL COMMENT 'col11',
  `col12` varchar(300) DEFAULT NULL COMMENT 'col12',
  `col13` varchar(300) DEFAULT NULL COMMENT 'col13',
  `col14` varchar(300) DEFAULT NULL COMMENT 'col14',
  `col15` varchar(300) DEFAULT NULL COMMENT 'col15',
  `col16` varchar(300) DEFAULT NULL COMMENT 'col16',
  `col17` varchar(300) DEFAULT NULL COMMENT 'col17',
  `col18` varchar(300) DEFAULT NULL COMMENT 'col18',
  `col19` varchar(300) DEFAULT NULL COMMENT 'col19',
  `col20` varchar(300) DEFAULT NULL COMMENT 'col20',
  `col21` varchar(300) DEFAULT NULL COMMENT 'col21',
  `col22` varchar(300) DEFAULT NULL COMMENT 'col22',
  `col23` varchar(300) DEFAULT NULL COMMENT 'col23',
  `col24` varchar(300) DEFAULT NULL COMMENT 'col24',
  `col25` varchar(300) DEFAULT NULL COMMENT 'col25',
  `col26` varchar(300) DEFAULT NULL COMMENT 'col26',
  `col27` varchar(300) DEFAULT NULL COMMENT 'col27',
  `col28` varchar(300) DEFAULT NULL COMMENT 'col28',
  `col29` varchar(300) DEFAULT NULL COMMENT 'col29',
  `col30` varchar(300) DEFAULT NULL COMMENT 'col30',
  `col31` varchar(300) DEFAULT NULL COMMENT 'col31',
  `col32` varchar(300) DEFAULT NULL COMMENT 'col32',
  `col33` varchar(300) DEFAULT NULL COMMENT 'col33',
  `col34` varchar(300) DEFAULT NULL COMMENT 'col34',
  `col35` varchar(300) DEFAULT NULL COMMENT 'col35',
  `col36` varchar(300) DEFAULT NULL COMMENT 'col36',
  `col37` varchar(300) DEFAULT NULL COMMENT 'col37',
  `col38` varchar(300) DEFAULT NULL COMMENT 'col38',
  `col39` varchar(300) DEFAULT NULL COMMENT 'col39',
  `col40` varchar(300) DEFAULT NULL COMMENT 'col40',
  `gmt_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `deleted` int(11) NOT NULL DEFAULT '0',
  `gmt_deleted` timestamp NULL DEFAULT NULL,
  `default_pk` varchar(300) NOT NULL COMMENT '主键值',
  `version` bigint(20) NOT NULL DEFAULT '0' COMMENT '版本号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `default_pk_dim` (`default_pk`, `dim_table`) ,
  KEY `idx_dim_id` (`dim_table`, `id`) ,
  KEY `idx_dim_deleted_id` (`dim_table`, `deleted`, `id`) ,
  KEY `idx_dim_deleted_gmt_modified` (`dim_table`, `deleted`, `gmt_modified`) ,
  KEY `idx_dim_id_gmt_modified` (`dim_table`, `id`, `gmt_modified`) ,
  KEY `idx_modified_id` (`gmt_modified`, `id`) ,
  KEY `idx_dim_gmt_modified_pk` (`dim_table`, `gmt_modified`, `default_pk`) ,
  KEY `idx_dim_default_pk_deleted` (`dim_table`, `default_pk`, `deleted`) ,
  KEY `idx_dim_version` (`dim_table`, `version`)
) AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4;

CREATE TABLE `table_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `ref_id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `metric_type` varchar(20) DEFAULT NULL,
  `tags` mediumtext DEFAULT NULL,
  `metrics` mediumtext DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4;
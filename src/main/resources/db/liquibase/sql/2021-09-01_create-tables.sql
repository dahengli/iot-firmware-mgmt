create TABLE t_firmwares (
  id            BIGINT(20)      NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  tenant_id     BIGINT(20)      NOT NULL                COMMENT '租户id',
  owner_type    TINYINT         NOT NULL                COMMENT '租户类型 0 普通租户 1 管理员',
  name          VARCHAR(128)    NOT NULL                COMMENT '固件名字',
  url           VARCHAR(256)    NOT NULL                COMMENT '固件下载链接',
  dev_type      VARCHAR(16)     NOT NULL DEFAULT ''     COMMENT '设备类型',
  description   VARCHAR(256)    NOT NULL                COMMENT '固件说明',
  version       VARCHAR(16)     NOT NULL DEFAULT ''     COMMENT '版本',
  firmware_type TINYINT         NOT NULL                COMMENT '固件类型 0全量类型 1差分类型',
  size          INT             NOT NULL                COMMENT '固件大小',
  create_time   DATETIME(3)     NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT 'record create date',
  update_time   DATETIME(3)     NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON update CURRENT_TIMESTAMP(3) COMMENT 'record update date',
  PRIMARY KEY (id),
  UNIQUE KEY uk_r_n (name),
  INDEX idx_r_u (update_time)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = 'Firmwares';
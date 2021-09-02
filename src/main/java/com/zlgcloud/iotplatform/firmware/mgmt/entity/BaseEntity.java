package com.zlgcloud.iotplatform.firmware.mgmt.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import java.util.Date;

@Data
public abstract class BaseEntity {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private Date createTime;

    private Date updateTime;
}

package com.zlgcloud.iotplatform.firmware.mgmt.entity;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "t_firmwares")
public class FirmwareEntity extends BaseEntity {
    private Long tenantId;
    private Integer ownerType;
    private String name;
    private String url;
    private String devType;
    private String description;
    private String version;
    private Integer firmwareType;
    private Integer size;
}

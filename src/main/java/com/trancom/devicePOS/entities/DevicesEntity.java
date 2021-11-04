package com.trancom.devicePOS.entities;

import javax.persistence.*;

//@Entity(name = "device") or
@Entity(name="devices")
@Table(name = "device")
public class DevicesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id", updatable = false)
    private Long deviceId;
    @Column(name = "model_type", updatable = true)
    private String modelType;

    @Column(name = "serial_number",nullable = false,unique = true)
    private String serialNumber;

    public DevicesEntity() {
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

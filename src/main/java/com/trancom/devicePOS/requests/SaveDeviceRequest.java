package com.trancom.devicePOS.requests;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class SaveDeviceRequest {

    @Column(name = "model_type", updatable = true)
    private String modelType;

    @Column(name = "serial_number",nullable = false,unique = true)
    private String serialNumber;

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

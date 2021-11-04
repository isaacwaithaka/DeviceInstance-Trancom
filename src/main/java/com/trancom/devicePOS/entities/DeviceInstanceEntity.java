package com.trancom.devicePOS.entities;

import javax.persistence.*;

@Entity(name = "deviceinstance")
public class DeviceInstanceEntity {
    @EmbeddedId
    private  DeviceInstncePkId deviceinstancePk;

    @JoinColumn(name = "fk_client_id", referencedColumnName = "id",updatable = false)
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private ClientEntity clientId;

    @JoinColumn(name = "fk_device_id", referencedColumnName = "device_id" ,updatable = false)
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private DevicesEntity deviceId;

    public DeviceInstncePkId getDeviceinstancePk() {
        return deviceinstancePk;
    }

    public void setDeviceinstancePk(DeviceInstncePkId deviceinstancePk) {
        this.deviceinstancePk = deviceinstancePk;
    }

    public ClientEntity getClientId() {
        return clientId;
    }

    public void setClientId(ClientEntity clientId) {
        this.clientId = clientId;
    }

    public DevicesEntity getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(DevicesEntity deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return "DeviceInstanceEntity{" +
                "deviceinstancePk=" + deviceinstancePk +
                ", clientId=" + clientId +
                ", deviceId=" + deviceId +
                '}';
    }
}

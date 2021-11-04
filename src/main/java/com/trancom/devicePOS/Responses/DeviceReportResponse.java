package com.trancom.devicePOS.Responses;

public class DeviceReportResponse {
    private String bank,branch,country,deviceSerial,clientName;

    public DeviceReportResponse(String bank, String branch, String country, String deviceSerial, String clientName) {
        this.bank = bank;
        this.branch = branch;
        this.country = country;
        this.deviceSerial = deviceSerial;
        this.clientName = clientName;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}

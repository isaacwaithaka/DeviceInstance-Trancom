package com.trancom.devicePOS.requests;

public class SaveClientRequest {
    private String clientName;
    private String clientCode;
    private Long bankId;

    public SaveClientRequest(String clientName, String clientCode, Long bankId) {
        this.clientName = clientName;
        this.clientCode = clientCode;
        this.bankId = bankId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    @Override
    public String toString() {
        return "SaveClientRequest{" +
                "clientName='" + clientName + '\'' +
                ", clientCode='" + clientCode + '\'' +
                ", bankCodeId='" + bankId + '\'' +
                '}';
    }
}

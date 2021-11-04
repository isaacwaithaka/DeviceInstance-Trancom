package com.trancom.devicePOS.requests;

import javax.persistence.Column;

public class SaveBankRequest {
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "bankCode",nullable = false,unique = true)
    private String bankCode;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}

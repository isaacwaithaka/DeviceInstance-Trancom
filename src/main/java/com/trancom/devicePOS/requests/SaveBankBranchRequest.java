package com.trancom.devicePOS.requests;

import javax.persistence.Column;

public class SaveBankBranchRequest {
    private String bankBranchName;
    private Long bankId;

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }
}

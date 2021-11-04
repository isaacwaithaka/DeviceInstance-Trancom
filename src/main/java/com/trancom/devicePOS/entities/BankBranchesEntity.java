package com.trancom.devicePOS.entities;

import javax.persistence.*;

@Entity(name = "bankBranches")
@Table(name = "bankBranches")
public class BankBranchesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bankBranchId", updatable = false)
    private Long bankBranchId;

    @Column(name = "bankBranchName")
    private String bankBranchName;

    @JoinColumn(name = "fk_bank_branch_Id", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private BankEntity bankDataObject;

    public BankBranchesEntity() {
    }

    public Long getBankBranchId() {
        return bankBranchId;
    }

    public void setBankBranchId(Long bankBranchId) {
        this.bankBranchId = bankBranchId;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public BankEntity getBankDataObject() {
        return bankDataObject;
    }

    public void setBankDataObject(BankEntity bankDataObject) {
        this.bankDataObject = bankDataObject;
    }
}

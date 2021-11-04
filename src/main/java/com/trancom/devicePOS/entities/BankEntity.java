package com.trancom.devicePOS.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "bank")
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_code")
    private String bankCode;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<ClientEntity> clients; //inverse relationship use it while fetching

    @OneToMany(mappedBy = "bankBranchId", fetch = FetchType.LAZY)
    private List<BankBranchesEntity> bankBranches; //inverse relationship use it while fetching


    public BankEntity() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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




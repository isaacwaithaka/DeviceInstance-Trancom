package com.trancom.devicePOS.entities;

import javax.persistence.*;

@Entity(name = "client")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "clientName")
    private String clientName;

    @JoinColumn(name = "fk_bank_Code_Id", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private BankEntity bank;

    public ClientEntity() {
    }

    public ClientEntity(String clientName, BankEntity bank) {
        this.clientName = clientName;
        this.bank = bank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public BankEntity getBank() {
        return bank;
    }

    public void setBank(BankEntity bank_CodeId) {
        this.bank = bank_CodeId;
    }
}




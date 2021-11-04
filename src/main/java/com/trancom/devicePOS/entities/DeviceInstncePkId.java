package com.trancom.devicePOS.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DeviceInstncePkId implements Serializable {
    @Column(name = "country_id",updatable = false)
    private Long CountryId;
    @Column(name = "bank_branch_id",updatable = false)
    private Long bankBranch;

    public DeviceInstncePkId() {
    }

    public Long getCountryId() {
        return CountryId;
    }

    public void setCountryId(Long countryId) {
        CountryId = countryId;
    }

    public Long getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(Long bankBranch) {
        this.bankBranch = bankBranch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeviceInstncePkId)) return false;
        DeviceInstncePkId that = (DeviceInstncePkId) o;
        return Objects.equals(getCountryId(), that.getCountryId()) && Objects.equals(getBankBranch(), that.getBankBranch());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryId(), getBankBranch());
    }
}

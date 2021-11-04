package com.trancom.devicePOS.Repositories;

import com.trancom.devicePOS.Responses.DeviceReportResponse;
import com.trancom.devicePOS.entities.DeviceInstanceEntity;
import com.trancom.devicePOS.entities.DeviceInstncePkId;
import com.trancom.devicePOS.entities.DevicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceInstanceRepository extends JpaRepository<DeviceInstanceEntity, DeviceInstncePkId> {
    @Query(value = "Select new com.trancom.devicePOS.Responses.DeviceReportResponse(d.clientId.bank.bankName, b.bankBranchName, c.name, d.deviceId.serialNumber, d.clientId.clientName) from deviceinstance d inner join bankBranches b on b.bankBranchId = d.deviceinstancePk.bankBranch inner join country  c on c.id = d.deviceinstancePk.CountryId")
    List<DeviceReportResponse> getDevices();
}

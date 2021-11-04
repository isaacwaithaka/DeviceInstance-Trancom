package com.trancom.devicePOS.Repositories;

import com.trancom.devicePOS.Responses.DeviceReportResponse;
import com.trancom.devicePOS.entities.CountryEntity;
import com.trancom.devicePOS.entities.DevicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<DevicesEntity,Long> {

}

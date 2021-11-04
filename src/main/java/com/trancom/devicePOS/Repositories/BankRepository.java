package com.trancom.devicePOS.Repositories;

import com.trancom.devicePOS.entities.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankEntity,Long> {

}

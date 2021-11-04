package com.trancom.devicePOS.Repositories;

import com.trancom.devicePOS.entities.BankBranchesEntity;
import com.trancom.devicePOS.entities.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankBranchRepository extends JpaRepository<BankBranchesEntity,Long> {

}

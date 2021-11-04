package com.trancom.devicePOS.Repositories;

import com.trancom.devicePOS.entities.BankEntity;
import com.trancom.devicePOS.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity,Long> {

}

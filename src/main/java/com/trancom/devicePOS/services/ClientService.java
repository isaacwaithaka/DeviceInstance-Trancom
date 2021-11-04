package com.trancom.devicePOS.services;

import com.trancom.devicePOS.Repositories.BankRepository;
import com.trancom.devicePOS.Repositories.ClientRepository;
import com.trancom.devicePOS.entities.BankEntity;
import com.trancom.devicePOS.entities.ClientEntity;
import com.trancom.devicePOS.requests.SaveBankRequest;
import com.trancom.devicePOS.requests.SaveClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    //AddCourse to DB
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    BankRepository bankRepository;

    public void addSaveClient(SaveClientRequest client) {
        System.out.println(client);
        BankEntity bank = bankRepository.getById(client.getBankId());
        ClientEntity clientObj = new ClientEntity();
        clientObj.setClientName(client.getClientName());
        clientObj.setBank(bank);
        clientRepository.save(clientObj);
        // or clientRepository.save(new ClientEntity(client.getClientName(), bank));
    }
}

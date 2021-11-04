package com.trancom.devicePOS.services;

import com.trancom.devicePOS.Repositories.BankBranchRepository;
import com.trancom.devicePOS.Repositories.BankRepository;
import com.trancom.devicePOS.Repositories.CountryRepository;
import com.trancom.devicePOS.entities.BankBranchesEntity;
import com.trancom.devicePOS.entities.BankEntity;
import com.trancom.devicePOS.entities.ClientEntity;
import com.trancom.devicePOS.entities.CountryEntity;
import com.trancom.devicePOS.requests.SaveBankBranchRequest;
import com.trancom.devicePOS.requests.SaveBankRequest;
import com.trancom.devicePOS.requests.SaveClientRequest;
import com.trancom.devicePOS.requests.SaveCountryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    //AddCourse to DB
    @Autowired
    private BankRepository bankRepository;
    public void addSaveBank(SaveBankRequest bank) {
        BankEntity bankEntityObject = new BankEntity();
        bankEntityObject.setBankName(bank.getBankName());
        bankEntityObject.setBankCode(bank.getBankCode());
        bankRepository.save(bankEntityObject);
        //or countryRepo.save(new CountryEntity(country.getName(),country.getCode()));
    }

    @Autowired
    private BankBranchRepository bankBranchRepository;
    public void addSaveBankBranch(SaveBankBranchRequest bankBranchReq) {
        System.out.println(bankBranchReq);
        BankEntity bankBranch = bankRepository.getById(bankBranchReq.getBankId());
        BankBranchesEntity bankBranchObj = new BankBranchesEntity();
        bankBranchObj.setBankBranchName(bankBranchReq.getBankBranchName());
        bankBranchObj.setBankDataObject(bankBranch);
        bankBranchRepository.save(bankBranchObj);
        // or clientRepository.save(new ClientEntity(client.getClientName(), bank));
    }

}

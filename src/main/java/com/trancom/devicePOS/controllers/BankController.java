package com.trancom.devicePOS.controllers;

import com.trancom.devicePOS.requests.SaveBankBranchRequest;
import com.trancom.devicePOS.requests.SaveBankRequest;
import com.trancom.devicePOS.requests.SaveCountryRequest;
import com.trancom.devicePOS.services.BankService;
import com.trancom.devicePOS.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "rest/v1/bank")
public class BankController {
   @Autowired
    BankService bankService;
    //ADD or SAVE bank TO DB
    @RequestMapping(method = RequestMethod.POST, value="/save")
    public void saveBank(@RequestBody SaveBankRequest bankk) {
        //LOGGER.info("Add New Job "+.getName());
        //System.out.println(bankk);
        bankService.addSaveBank(bankk);
    }
    @RequestMapping(method = RequestMethod.POST, value="/saveBankBranch")
    public void saveBankBranch(@RequestBody SaveBankBranchRequest bankBranchh) {
        //LOGGER.info("Add New Job "+.getName());
        //System.out.println(bankk);
        bankService.addSaveBankBranch(bankBranchh);
    }
}

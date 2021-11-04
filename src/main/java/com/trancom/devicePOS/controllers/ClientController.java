package com.trancom.devicePOS.controllers;

import com.trancom.devicePOS.requests.SaveBankRequest;
import com.trancom.devicePOS.requests.SaveClientRequest;
import com.trancom.devicePOS.services.BankService;
import com.trancom.devicePOS.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "rest/v1/client")
public class ClientController {
   @Autowired
   ClientService clientService;
    //ADD or SAVE client TO DB
    @RequestMapping(method = RequestMethod.POST, value="/saveClient")
    public void saveClient(@RequestBody SaveClientRequest clientt) {
        clientService.addSaveClient(clientt);
    }
}

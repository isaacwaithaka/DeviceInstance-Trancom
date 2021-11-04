package com.trancom.devicePOS.controllers;

import com.trancom.devicePOS.requests.SaveCountryRequest;
import com.trancom.devicePOS.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "rest/v1/country")
public class CountryController {
   @Autowired
    CountryService countryService;
    //ADD or SAVE Country TO DB
    @RequestMapping(method = RequestMethod.POST, value="/save")
    public void saveCountry(@RequestBody SaveCountryRequest country) {
        //LOGGER.info("Add New Job "+.getName());
        //System.out.println(country);
        countryService.addSaveCountry(country);
    }
}

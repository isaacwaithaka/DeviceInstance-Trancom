package com.trancom.devicePOS.services;

import com.trancom.devicePOS.Repositories.CountryRepository;
import com.trancom.devicePOS.entities.CountryEntity;
import com.trancom.devicePOS.requests.SaveCountryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    //AddCourse to DB
    @Autowired
    private CountryRepository countryRepo;
    public void addSaveCountry(SaveCountryRequest country) {
        CountryEntity countryEntityObject = new CountryEntity();
        countryEntityObject.setCode(country.getCode());
        countryEntityObject.setName(country.getName());
        countryRepo.save(countryEntityObject);
        //or countryRepo.save(new CountryEntity(country.getName(),country.getCode()));
    }
}

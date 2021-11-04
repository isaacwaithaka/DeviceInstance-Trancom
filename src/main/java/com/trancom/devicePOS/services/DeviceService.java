package com.trancom.devicePOS.services;

import com.trancom.devicePOS.Repositories.ClientRepository;
import com.trancom.devicePOS.Repositories.CountryRepository;
import com.trancom.devicePOS.Repositories.DeviceInstanceRepository;
import com.trancom.devicePOS.Repositories.DeviceRepository;
import com.trancom.devicePOS.entities.*;
import com.trancom.devicePOS.requests.SaveCountryRequest;
import com.trancom.devicePOS.requests.SaveDeviceInstanceRequest;
import com.trancom.devicePOS.requests.SaveDeviceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
    //AddCourse to DB
    @Autowired
    private DeviceRepository devRepo;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    DeviceInstanceRepository deviceInstanceRepository;
    public void addSaveDevice(SaveDeviceRequest devicee) {
        DevicesEntity deviceEntityObject = new DevicesEntity();
        deviceEntityObject.setModelType(devicee.getModelType());
        deviceEntityObject.setSerialNumber(devicee.getSerialNumber());
        devRepo.save(deviceEntityObject);
        //or countryRepo.save(new CountryEntity(country.getName(),country.getCode()));
    }
    public void createDeviceInstance(SaveDeviceInstanceRequest request){
        ClientEntity client=clientRepository.getById(request.getClientId());
        DevicesEntity device=devRepo.getById(request.getDeviceId());
        DeviceInstncePkId id = new DeviceInstncePkId();
        id.setCountryId(request.getCountryId());
        id.setBankBranch(request.getBranchId());

        DeviceInstanceEntity deviceInstantObj = new DeviceInstanceEntity();

        deviceInstantObj.setDeviceId(device);
        deviceInstantObj.setDeviceinstancePk(id);
        deviceInstantObj.setClientId(client);
        deviceInstanceRepository.save(deviceInstantObj);
    }

}

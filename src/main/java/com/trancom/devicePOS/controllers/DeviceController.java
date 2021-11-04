package com.trancom.devicePOS.controllers;

import com.trancom.devicePOS.Repositories.DeviceInstanceRepository;
import com.trancom.devicePOS.Responses.DeviceReportResponse;
import com.trancom.devicePOS.requests.SaveCountryRequest;
import com.trancom.devicePOS.requests.SaveDeviceInstanceRequest;
import com.trancom.devicePOS.requests.SaveDeviceRequest;
import com.trancom.devicePOS.services.CountryService;
import com.trancom.devicePOS.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "rest/v1/device")
public class DeviceController {
   @Autowired
   DeviceService deviceService;

   @Autowired
    DeviceInstanceRepository deviceInstanceRepository;
    //ADD or SAVE Country TO DB
    @RequestMapping(method = RequestMethod.POST, value="/save")
    public void saveDevice(@RequestBody SaveDeviceRequest device) {
        //LOGGER.info("Add New Job "+.getName());
        //System.out.println(device);
        deviceService.addSaveDevice(device);
    }

    @RequestMapping(method = RequestMethod.POST, value="/saveDeviceInstance")
    public void saveDeviceInstance(@RequestBody SaveDeviceInstanceRequest deviceInstance) {
        //LOGGER.info("Add New Job "+.getName());
        //System.out.println(device);
        deviceService.createDeviceInstance(deviceInstance);
    }

    @RequestMapping(method = RequestMethod.GET, value="/deviceReport")
    public List<DeviceReportResponse> saveDeviceInstance() {
        return deviceInstanceRepository.getDevices();
    }
}

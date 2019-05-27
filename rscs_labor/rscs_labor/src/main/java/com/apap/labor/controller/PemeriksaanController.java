package com.apap.labor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.apap.labor.model.PemeriksaanModel;
import com.apap.labor.service.PemeriksaanService;


@RestController
@RequestMapping("/pemeriksaan")
public class PemeriksaanController {
    @Autowired
    private PemeriksaanService pemeriksaanService;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Bean
    public RestTemplate rest() {
    	return new RestTemplate();
    }
    
//    @GetMapping(value = "/status/{licenseNumber}")
//    private String getStatus(@PathVariable("licenseNumber") String licenseNumber) throws Exception{
//        String path = Setting.pilotUrl + "/pilot?licenseNumber="+licenseNumber;
//        return restTemplate.getForEntity(path, String.class).getBody();
//    }
//    
//    @GetMapping(value = "/full/{licenseNumber}")
//    private PilotDetail postStatus(@PathVariable("licenseNumber") String licenseNumber) throws Exception {
//    	String path = Setting.pilotUrl + "/pilot";
//    	PilotModel pilot = pilotService.getPilotDetailByLicenseNumber(licenseNumber);
//    	PilotDetail detail = restTemplate.postForObject(path, pilot, PilotDetail.class);
//        return detail;
//    }
//
//    @PostMapping(value = "/add")
//    private PilotModel addPilotSubmit(@RequestBody PilotModel pilot) {
//        return pilotService.addPilot(pilot);
//    }
//    
//    @GetMapping(value = "/view/{licenseNumber}")
//    private PilotModel pilotView(@PathVariable("licenseNumber") String licenseNumber) {
//        PilotModel pilot = pilotService.getPilotDetailByLicenseNumber(licenseNumber);
//        return pilot;
//    }
//
//    @DeleteMapping(value = "/delete")
//    private String deletePilot(@RequestParam("pilotId") long pilotId) {
//        PilotModel pilot = pilotService.getPilotDetailById(pilotId).get();
//        pilotService.deletePilot(pilot);
//        return "success";
//    }
//
//    @PutMapping(value = "/update/{pilotId}")
//    private String updatePilotSubmit(@PathVariable("pilotId") long pilotId,
//    		@RequestParam("name") String name,
//    		@RequestParam("flyHour") int flyHour) {
//        PilotModel pilot = pilotService.getPilotDetailById(pilotId).get();
//        if(pilot.equals(null)) {
//        	return "Couldn't find your pilot";
//        }
//        pilot.setName(name);
//        pilot.setFlyHour(flyHour);
//        pilotService.updatePilot(pilotId, pilot);
//        return "update";
//    }
    
    @GetMapping(value = "/permintaan")
    private List<PemeriksaanModel> pemeriksaanView() {
        List<PemeriksaanModel> pemeriksaan = pemeriksaanService.getAllPermintaan();
        return pemeriksaan;
    }
}
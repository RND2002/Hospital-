package com.finalProjectBackend.HealthCare.controller;

import com.finalProjectBackend.HealthCare.entity.HospitalEntity;
import com.finalProjectBackend.HealthCare.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;
//    @GetMapping("getAll")
//    public ResponseEntity<List<HospitalEntity>> retreiveListOFHospital(){
//        return hospitalService.getAllHospitals();
//    }

    @GetMapping("getHospitalById")
    public HospitalEntity getHospitalById(@RequestBody Long id){
        return hospitalService.getHospitalById(id);
    }
}

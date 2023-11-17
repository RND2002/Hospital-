package com.finalProjectBackend.HealthCare.controller;

import com.finalProjectBackend.HealthCare.entity.DoctorEntity;
import com.finalProjectBackend.HealthCare.entity.HospitalEntity;
import com.finalProjectBackend.HealthCare.entity.PatientEntity;
import com.finalProjectBackend.HealthCare.service.DoctorService;
import com.finalProjectBackend.HealthCare.service.HospitalService;
import com.finalProjectBackend.HealthCare.service.LoginService;
import com.finalProjectBackend.HealthCare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("registration")
public class RegistrationController {

    @Autowired
    private PatientService patientService;
    @Autowired
    private DoctorService doctorService;

    @Autowired
    private HospitalService hospitalService;

    @Autowired
    private LoginService loginService;

    @PostMapping("addPatient")
    public ResponseEntity<String> addPatientToRepository(@RequestBody PatientEntity entity){


        return patientService.addPatientToRepository(entity);

    }

    @PostMapping("addDoctor")
    public ResponseEntity<String> addDoctorToRepo(@RequestBody DoctorEntity entity){
        return doctorService.addDoctorToRepository(entity);
    }

    @PostMapping("addHospital")
    public ResponseEntity<String> addHospitalToRepo(@RequestBody HospitalEntity entity){
        return hospitalService.addHospitalToRepository(entity);
    }
    @GetMapping("getAllHospital")
    public ResponseEntity<List<HospitalEntity>> retreiveListOFHospital(){
        return hospitalService.getAllHospitals();
    }

    @GetMapping("getRoleOfUser")
    public String getRoleOfLoggedInUser(@RequestBody String email){
        return loginService.roleOfLoggedInUser(email);
    }

}

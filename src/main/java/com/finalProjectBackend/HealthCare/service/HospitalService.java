package com.finalProjectBackend.HealthCare.service;

import com.finalProjectBackend.HealthCare.entity.HospitalEntity;
import com.finalProjectBackend.HealthCare.entity.LoginEntity;
import com.finalProjectBackend.HealthCare.repository.HospitalRepository;
import com.finalProjectBackend.HealthCare.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private LoginRepository loginRepository;

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    public ResponseEntity<String> addHospitalToRepository(HospitalEntity entity){
        entity.setPassword(passwordEncoder().encode(entity.getPassword()));
        LoginEntity loginEntity=new LoginEntity();
        loginEntity.setPassword(entity.getPassword());
        loginEntity.setRole(entity.getRole());
        loginEntity.setEmailAddress(entity.getEmailAddress());
        hospitalRepository.save(entity);
        loginRepository.save(loginEntity);

        return new ResponseEntity<>("Hospital addedd successfully", HttpStatus.OK);
    }

    public ResponseEntity<List<HospitalEntity>> getAllHospitals(){
        return new ResponseEntity<>(hospitalRepository.findAll(),HttpStatus.OK);
    }

    public HospitalEntity getHospitalById(Long id){
        return hospitalRepository.getReferenceById(id);
    }


}

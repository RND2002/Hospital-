package com.finalProjectBackend.HealthCare.service;

import com.finalProjectBackend.HealthCare.entity.LoginEntity;
import com.finalProjectBackend.HealthCare.entity.PatientEntity;
import com.finalProjectBackend.HealthCare.repository.LoginRepository;
import com.finalProjectBackend.HealthCare.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private LoginRepository loginRepository;

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public ResponseEntity<String> addPatientToRepository(PatientEntity entity){
        LoginEntity loginEntity=new LoginEntity();

        entity.setPassword(passwordEncoder().encode(entity.getPassword()));
        loginEntity.setEmailAddress(entity.getEmailAddress());
        loginEntity.setPassword(entity.getPassword());
        loginEntity.setRole(entity.getRole());
        loginRepository.save(loginEntity);
        patientRepository.save(entity);
        return new ResponseEntity<>("Patient saved Successfully", HttpStatus.OK);
    }
}

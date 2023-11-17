package com.finalProjectBackend.HealthCare.service;

import com.finalProjectBackend.HealthCare.entity.DoctorEntity;
import com.finalProjectBackend.HealthCare.entity.HospitalEntity;
import com.finalProjectBackend.HealthCare.entity.LoginEntity;
import com.finalProjectBackend.HealthCare.repository.DoctorRepository;
import com.finalProjectBackend.HealthCare.repository.HospitalRepository;
import com.finalProjectBackend.HealthCare.repository.LoginRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    HospitalRepository hospitalRepository;

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    public ResponseEntity<String> addDoctorToRepository(DoctorEntity entity){
        System.out.println(entity.getHospital()+"madharchode");
        entity.setPassword(passwordEncoder().encode(entity.getPassword()));
        LoginEntity loginEntity=new LoginEntity();
        loginEntity.setEmailAddress(entity.getEmailAddress());
        loginEntity.setPassword(entity.getPassword());
        loginEntity.setRole(entity.getRole());
        loginRepository.save(loginEntity);
//        System.out.println(entity.getHospital()+"madharchode");
        HospitalEntity hospitalEntity=hospitalRepository.getById(entity.getHospital());
        //long hospital = entity.getHospitalEntity().getHospitalId();
        long id=hospitalEntity.getHospitalId();
        entity.setHospitalEntity(hospitalRepository.findById(id).orElseThrow());
       // entity.setHospital(hospitalRepository.getById(hospital).getHospitalId());
        //hospitalEntity.setDoctorEntitiy(entity);
        doctorRepository.save(entity);
        return new ResponseEntity<>("Doctor Added successsfully", HttpStatus.OK);
    }
}

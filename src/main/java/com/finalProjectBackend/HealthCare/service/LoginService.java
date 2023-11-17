package com.finalProjectBackend.HealthCare.service;

import com.finalProjectBackend.HealthCare.entity.LoginEntity;
import com.finalProjectBackend.HealthCare.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public ResponseEntity<String> saveLoginInfo(LoginEntity loginEntity){
        loginRepository.save(loginEntity);
        return new ResponseEntity<>("Login info saved", HttpStatus.OK);
    }

    public String roleOfLoggedInUser(String email){
       LoginEntity loggedInUser= loginRepository.findByEmailAddress(email);
       return loggedInUser.getRole();
    }
}

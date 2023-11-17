package com.finalProjectBackend.HealthCare.controller;

import com.finalProjectBackend.HealthCare.entity.PatientEntity;
import com.finalProjectBackend.HealthCare.service.PatientService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("patient")
public class PatientController {
    @GetMapping("suck")
    public String getDick(){
        return "fukc";
    }

}

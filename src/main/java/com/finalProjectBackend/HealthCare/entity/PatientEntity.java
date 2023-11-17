package com.finalProjectBackend.HealthCare.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long patientId;

    private String fullName;

    private String adharNumber;

    private String password;

    private String emailAddress;

    private String fullAddress;

    private String role;

    private String city;

    private String zipCode;


    @OneToMany(mappedBy = "patientEntity")

    private List<DoctorEntity> doctorEntityList=new ArrayList<>();
}

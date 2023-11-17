package com.finalProjectBackend.HealthCare.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class HospitalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long hospitalId;

    private String hospitalName;

    private String registrationNumber;

    private String emailAddress;

    private String password;

    private String specialization;

    private String fullAddress;

    private String city;

    private String role;

    private String zipCode;

    @OneToMany(mappedBy = "hospitalEntity")
    @JsonManagedReference
   private List<DoctorEntity> doctorEntities=new ArrayList<>();

}

package com.finalProjectBackend.HealthCare.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long doctorId;

    private String fullName;

    private String registrationName;

    private String specialization;

    private String emailAddress;

    private String password;

    private String role;

    private String fullAddress;

    private String city;

    private String zipCode;

    private long hospital;



//    @OneToOne
//    @JoinColumn(name = "hospital_id")
//    private HospitalEntity hospital;
    @ManyToOne
    @JoinColumn(name="hospital_id")
    @JsonBackReference
    private HospitalEntity hospitalEntity;


    @ManyToOne
    @JoinColumn(name="patient_id")
    private PatientEntity patientEntity;

}

package com.finalProjectBackend.HealthCare.repository;

import com.finalProjectBackend.HealthCare.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity,Long> {



//    @Query(value="SELECT p FROM PatientEntity p Where p.emailAddress=:emailAddress")
//    PatientEntity findByEmail(String emailAddress);
//
//    UserDetails findByEmailAddress(String emailAddress);
PatientEntity findByEmailAddress(String emailAddress);
}

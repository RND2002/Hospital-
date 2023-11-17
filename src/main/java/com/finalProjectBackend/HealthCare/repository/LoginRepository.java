package com.finalProjectBackend.HealthCare.repository;

import com.finalProjectBackend.HealthCare.entity.LoginEntity;
import com.finalProjectBackend.HealthCare.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity,Long> {

    LoginEntity findByEmailAddress(String emailAddress);
}

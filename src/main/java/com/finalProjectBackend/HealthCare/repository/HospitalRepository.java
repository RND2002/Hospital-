package com.finalProjectBackend.HealthCare.repository;

import com.finalProjectBackend.HealthCare.entity.HospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity,Long> {
    HospitalEntity findByHospitalName(String hospital);
}

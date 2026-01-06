package com.javaee.se_final_backend.repository;

import com.javaee.se_final_backend.model.entity.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Integer>{
}

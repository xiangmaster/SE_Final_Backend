package com.javaee.se_final_backend.repository;

import com.javaee.se_final_backend.model.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository<Family, Integer>{
}

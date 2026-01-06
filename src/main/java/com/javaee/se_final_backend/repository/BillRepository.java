package com.javaee.se_final_backend.repository;

import com.javaee.se_final_backend.model.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Integer>{
}

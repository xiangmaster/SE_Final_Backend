package com.javaee.se_final_backend.repository;

import com.javaee.se_final_backend.model.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Integer>{
}

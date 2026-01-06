package com.javaee.se_final_backend.repository;

import com.javaee.se_final_backend.model.entity.UserTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTask extends JpaRepository<UserTask, Integer>{
}

package com.javaee.se_final_backend.repository;

import com.javaee.se_final_backend.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer>{
}

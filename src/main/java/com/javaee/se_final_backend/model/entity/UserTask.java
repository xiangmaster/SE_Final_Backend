package com.javaee.se_final_backend.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "UserTask")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(UserTask.UserTaskId.class)
public class UserTask {

    @Id
    private Integer userId;

    @Id
    private Integer taskId;

    public static class UserTaskId implements Serializable {
        private Integer userId;
        private Integer taskId;
    }
}






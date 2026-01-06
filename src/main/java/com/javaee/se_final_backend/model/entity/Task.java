package com.javaee.se_final_backend.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Task")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer parentId;

    private String type;
    private String status;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;
    private String title;
    private String content;
    private Integer progress;
}


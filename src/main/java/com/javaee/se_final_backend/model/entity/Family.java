package com.javaee.se_final_backend.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Family")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}


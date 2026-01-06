package com.javaee.se_final_backend.model.entity;

import com.javaee.se_final_backend.converter.JsonMapConverter;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "ExaminationReport")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExaminationReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    @Convert(converter = JsonMapConverter.class)
    @Column(columnDefinition = "json")
    private Map<String, Object> keyIndex;
    private String file;
    private LocalDateTime time;
}


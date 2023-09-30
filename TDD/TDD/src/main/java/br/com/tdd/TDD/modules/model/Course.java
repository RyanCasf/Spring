package br.com.tdd.TDD.modules.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity @Table(name="course")
@Data @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode
public class Course {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String description;
    private Long workloadHour;
}
package com.example.springstart.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "SEYF")
public class Person1 {
    @Id
    @Column(name = "first_table")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String lastname;

}

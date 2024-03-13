package com.example.springstart.model;
import jakarta.persistence.*;

@Entity
public class Person1 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "table")
    private Long id;
}

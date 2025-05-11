package com.nav.springJpa;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
}

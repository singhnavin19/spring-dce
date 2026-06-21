package com.nav.springjpamysql.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student_details")
public class StudentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    int id;

    @Column
    String name;

    @Column
    String subject;
    public StudentDetail(){

    }
    public StudentDetail(String subject, String name, int id) {
        this.subject = subject;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "StudentDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

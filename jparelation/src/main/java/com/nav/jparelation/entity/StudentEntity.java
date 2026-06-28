package com.nav.jparelation.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;

    @Column(length = 100)
    private String firstName;

    @Column(length = 100)
    private String middleName;

    @Column(length = 100)
    private String lastName;

    @Column
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<StudentAddressEntity> studentAddressEntities=new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<StudentAddressEntity> getStudentAddressEntities() {
        return studentAddressEntities;
    }

    public void setStudentAddressEntities(List<StudentAddressEntity> studentAddressEntities) {
        this.studentAddressEntities = studentAddressEntities;
    }

    public StudentEntity(Integer sid, String firstName, String middleName, String lastName, LocalDate dateOfBirth, List<StudentAddressEntity> studentAddressEntities) {
        this.sid = sid;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.studentAddressEntities = studentAddressEntities;
    }
    public StudentEntity(){}

    @Override
    public String toString() {
        return "StudentEntity{" +
                "sid=" + sid +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", studentAddressEntities=" + studentAddressEntities +
                '}';
    }
}

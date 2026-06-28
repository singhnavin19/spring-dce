package com.nav.jparelation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_address")
public class StudentAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;

    @Column
    private String addressType;

    @Column(length = 700)
    private String address;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public StudentAddressEntity(Integer addressId, String addressType, String address, StudentEntity student) {
        this.addressId = addressId;
        this.addressType = addressType;
        this.address = address;
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentAddressEntity{" +
                "addressId=" + addressId +
                ", addressType='" + addressType + '\'' +
                ", address='" + address + '\'' +
//                ", studentEntity=" + student +
                '}';
    }

    public StudentAddressEntity(){}
}

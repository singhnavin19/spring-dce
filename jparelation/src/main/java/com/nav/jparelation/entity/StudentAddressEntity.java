package com.nav.jparelation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_address")
public class StudentAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;

    @Column
    private Integer sid;

    @Column
    private String addressType;

    @Column(length = 700)
    private String address;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public StudentAddressEntity(Integer sid, String addressType, String address) {
        this.sid = sid;
        this.addressType = addressType;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentAddressEntity{" +
                "addressId=" + addressId +
                ", sid=" + sid +
                ", addressType='" + addressType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public StudentAddressEntity(){}
}

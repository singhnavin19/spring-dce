package com.nav.springRest;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firsName;
    private String lastName;
    private String address;
    private long mobileNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public StudentEntity(){

    }
    public StudentEntity(String firsName, String lastName, String address, long mobileNo) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}

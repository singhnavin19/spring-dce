package com.nav.springRest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
    private int id;
    @NotNull
    private String firsName;
    @NotBlank
    @NotNull
    @Size(min = 2,max = 50)
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

    public Student(int id, String firsName, String lastName, String address, long mobileNo) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}

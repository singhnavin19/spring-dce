package com.nav.springRest;

public class Student {
    int id;
    String firsName;
    String lastName;
    String address;
    long mobileNo;

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
}

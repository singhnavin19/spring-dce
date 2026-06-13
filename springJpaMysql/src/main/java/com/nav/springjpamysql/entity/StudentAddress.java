package com.nav.springjpamysql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentAddress {
    @Id
    @Column
    private int sid;

    @Column(length = 500)
    private String tempAddress;

    @Column
    private String permanentAddrress;

    public String getPermanentAddrress() {
        return permanentAddrress;
    }

    public void setPermanentAddrress(String permanentAddrress) {
        this.permanentAddrress = permanentAddrress;
    }

    public String getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(String tempAddress) {
        this.tempAddress = tempAddress;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "sid=" + sid +
                ", tempAddress='" + tempAddress + '\'' +
                ", permanentAddrress='" + permanentAddrress + '\'' +
                '}';
    }

    public StudentAddress(){}
    public StudentAddress(int sid, String tempAddress, String permanentAddrress) {
        this.sid = sid;
        this.tempAddress = tempAddress;
        this.permanentAddrress = permanentAddrress;
    }
}


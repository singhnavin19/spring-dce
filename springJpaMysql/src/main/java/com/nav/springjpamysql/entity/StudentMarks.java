package com.nav.springjpamysql.entity;

import jakarta.persistence.*;

@Entity
public class StudentMarks {

    int sid;

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int sMarkId;

    @Column(length = 100)
    String subject ;

    @Column
    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getsMarkId() {
        return sMarkId;
    }

    public void setsMarkId(int sMarkId) {
        this.sMarkId = sMarkId;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public StudentMarks(int sid, String subject, int marks) {
        this.sid = sid;
        this.subject = subject;
        this.marks = marks;
    }
    public StudentMarks(){}
}

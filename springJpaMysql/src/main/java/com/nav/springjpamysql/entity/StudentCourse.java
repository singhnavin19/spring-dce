package com.nav.springjpamysql.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="student_course")
public class StudentCourse {

    @Column(name = "student_id",nullable = false)
    private int sid;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;

    @Column
    private String courseName;

    public StudentCourse(int sid, int courseId, String courseName) {
        this.sid = sid;
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public StudentCourse(){}

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

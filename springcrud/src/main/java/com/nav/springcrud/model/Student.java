package com.nav.springcrud.model;

public class Student {
    int id;
    String name;
    int marks;
    float percentage;

    public Student(int id, String name, int marks, float percentage) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
    public int getMarks() {
        return marks;
    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//
//    public float getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(float percentage) {
//        this.percentage = percentage;
//    }
}

package com.nav.main.injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
@Component
public class Student {
    public  Course c;

//    @Autowired
//    public Student(){
//        System.out.println("1st");
//        this.c=null;
//    }
//
//    @Autowired
//    public Student(Course c){
//        System.out.println("2nd");
//        this.c=c;
//    }


    public Course getC() {
        return c;
    }

    @Autowired
    public void setC(Course c) {
        this.c = c;
    }

    public void courseDoing(){
        c.name="Java";
        c.courseName();
    }
}

package com.nav.springRest;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class StudentService {
    public static List<Student> students=new ArrayList<>();

    static {
        Random random=new Random();
        students.add(getStudent(random.nextInt(100),"omkar"," G","Kandivali",123));
        students.add(getStudent(random.nextInt(100),"omkar"," P","Kandivali",1234));
        students.add(getStudent(random.nextInt(100),"Darshan"," D","Kandivali",1235));
        students.add(getStudent(random.nextInt(100),"Abhinay"," T","Kandivali",1236));

    }

    private static Student getStudent(int id,String fname,String lname,String address,long mobNo) {
        return new Student(id, fname, lname, address,mobNo );
    }


}

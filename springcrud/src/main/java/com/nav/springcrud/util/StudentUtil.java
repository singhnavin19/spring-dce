package com.nav.springcrud.util;

import com.nav.springcrud.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
    public static List<Student> studentList=new ArrayList<>();

    static{
        studentList.add(new Student(1,"Navin1",90,90));
        studentList.add(new Student(2,"Navin2",80,80));
        studentList.add(new Student(3,"Navin3",70,70));
        studentList.add(new Student(4,"Navin4",60,60));
        studentList.add(new Student(5,"Navin5",50,50));
    }
    public static Student getStudentById(int id){
        for(Student student:studentList){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }
}

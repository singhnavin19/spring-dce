package com.nav.springcrud.controller;

import com.nav.springcrud.model.Student;
import com.nav.springcrud.util.StudentUtil;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StundetController {
    @GetMapping("/students")
    public List<Student> getStudents(){
        return StudentUtil.studentList;
    }
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        return StudentUtil.getStudentById(id);
    }
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        StudentUtil.studentList.add(student);
        return "student crated successfully";
    }

}

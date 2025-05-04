package com.nav.springRest;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/allStudent")
    public List<Student> getAllStudents(){
        return  studentService.students;
    }

    @GetMapping("/id/{id}")
    public String getById(@PathVariable Integer id){
        return  studentService.getStudentById(id).toString();
    }
    @GetMapping("/nameById/{id}")
    public String getNameById(@PathVariable Integer id){
        int i=0;
        System.out.println(10/i);
        return  studentService.getStudentById(id).getFirsName();
    }

    @GetMapping("/id")
    public Student getById1(@RequestParam("id") Integer id){
        return  studentService.getStudentById(id);
    }

    @PostMapping("/add")
    public Student addStudents(@RequestBody Student student){
        student.setId(new Random().nextInt(100));
        studentService.students.add(student);
        return student;
    }

    @PutMapping("/id/{id}")
    public Student update(@RequestBody Student student){
        Student dbStudent=studentService.getStudentById(student.getId());
        dbStudent.setFirsName(student.getFirsName());
        dbStudent.setAddress(student.getAddress());
        return dbStudent;
    }

    @DeleteMapping("/id/{id}")
    public void delete(@PathVariable  int id) throws Exception{
        studentService.deleteStudentById(id);
    }

}

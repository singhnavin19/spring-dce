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

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return  studentService.students;
    }

//    @GetMapping("/id/{id}")
//    public String getById(@PathVariable Integer id){
//        return  studentService.students.get(id);
//    }
//
//    @GetMapping("/id")
//    public String getById1(@RequestParam("id") Integer id){
//        return  studentService.students.get(id);
//    }
//
//    @PostMapping("/add")
//    public String addStudents(@RequestBody String name){
//        Random r=new Random();
//        int id = r.nextInt(100);
//        studentService.students.put(id,name);
//        return "name ="+name+" and id="+id;
//    }

}

package com.nav.springRest;

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
    public Map<Integer,String> getAllStudents(){
        return  studentService.students;
    }

    @GetMapping("/id/{id}")
    public String getById(@PathVariable Integer id){
        return  studentService.students.get(id);
    }

    @GetMapping("/id")
    public String getById1(@RequestParam("id") Integer id){
        return  studentService.students.get(id);
    }

    @PostMapping("/add")
    public String addStudents(@RequestBody String name){
        System.out.println(name);
        studentService.students.put(11,name);
        return "hello "+name;
    }

}

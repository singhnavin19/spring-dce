package com.nav.springRest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    List<String> studentList=List.of("Krishna","Omkar P","Ajmat","Omkar G","Abhinay");

   @GetMapping("/students")
//    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public List<String> getAllStudents(){
        return  studentList;
    }

}

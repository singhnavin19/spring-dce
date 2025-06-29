package com.nav.spring_mvc.controller;

import com.nav.spring_mvc.model.entity.StudentEntity;
import com.nav.spring_mvc.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private  StudentRepository studentRepository;

    @GetMapping(value = "/hello")
    public String hello(Model model){
        model.addAttribute("allStudent",studentRepository.findAll());
        model.addAttribute("studentDetail",studentRepository.findById(1).get());
        System.out.println("test1");
        return "welcome";
    }

//    public String createStudent(Model model){
//        StudentEntity studentEntity=new StudentEntity();
//        studentEntity.setStudentName("hello1");
//        studentRepository.save(studentEntity);
//        return "welcome";
//    }


}

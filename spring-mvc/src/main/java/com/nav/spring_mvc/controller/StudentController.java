package com.nav.spring_mvc.controller;

import com.nav.spring_mvc.model.entity.StudentDto;
import com.nav.spring_mvc.model.entity.StudentEntity;
import com.nav.spring_mvc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(value = "/createStudent")
    public String createStudent(){
        return "CreateStudent";
    }

    @GetMapping(value = "/saveStudent")
    public String saveStudent(@ModelAttribute  StudentDto studentDto){
        System.out.println(studentDto);
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setStudentName(studentDto.getName());
        studentEntity.setAddress(studentDto.getAddress());
        studentRepository.save(studentEntity);
        return "redirect:/allStudent";
    }

    @GetMapping("/allStudent")
    public String hello(Model model){
        model.addAttribute("allStudent",studentRepository.findAll());
        model.addAttribute("studentDetail",studentRepository.findById(1).get());
        return "welcome";
    }

}

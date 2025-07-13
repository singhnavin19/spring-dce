package com.nav.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AttributesController {

    @GetMapping("/attribute")
    public String attributeExample(Model model){
        model.addAttribute("name","Navin Singh");
        List<String> studentNames=List.of("Darshan","Azmat","Omkar","Abhinay","hello");
        model.addAttribute("studentNames",studentNames);
        return "Attributes";
    }
}

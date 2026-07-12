package com.nav.mcv.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("sayHello Method");
        return "hello1";
    }
    @GetMapping("/byebye")
    public String sayByeBye(Model model){
        model.addAttribute("name","Navin Singh");
        System.out.println(model.getAttribute("name"));
        return "byebye";
    }
}

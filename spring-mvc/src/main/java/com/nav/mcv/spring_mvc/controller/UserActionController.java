package com.nav.mcv.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserActionController {
    @PostMapping("/login")
    public String loginPage(Model model, @RequestParam String userName){
        System.out.println("login form submitted"+userName);
        model.addAttribute("data","controller date");
        List<String> names=List.of("Navin","Singh","Aadhya","Prachi");

        for(String name:names){
            System.out.println(name);
        }
        model.addAttribute("students",names);

        return "hello1";
    }
}

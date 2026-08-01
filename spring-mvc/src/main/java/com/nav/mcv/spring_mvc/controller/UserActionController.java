package com.nav.mcv.spring_mvc.controller;

import com.nav.mcv.spring_mvc.model.LoginEntity;
import com.nav.mcv.spring_mvc.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class UserActionController {

    private final LoginRepository loginRepository;
    @Autowired
    public UserActionController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @PostMapping("/login")
    public String loginPage(Model model, @RequestParam String userName){
        System.out.println("login form submitted"+userName);
        model.addAttribute("data","controller date");
        List<String> names=List.of("Navin","Singh","Aadhya","Prachi");
        LoginEntity loginEntity=new LoginEntity(userName, LocalDate.now(),null);
        loginRepository.save(loginEntity);
        for(String name:names){
            System.out.println(name);
        }
        model.addAttribute("students",names);

        return "login";
    }
}

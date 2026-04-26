package com.dce.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavinController {
    @Autowired
    private  NavinCompoenent navinCompoenent;

    @GetMapping("/getinfo")
    public PersonDetail info(){
        return navinCompoenent.getBasicInfo();
    }
    @GetMapping("/navin1")
    public String infoa(){
        System.out.println("Navin Sir .Java,Python");
        return "Navin Sir1";
    }
}

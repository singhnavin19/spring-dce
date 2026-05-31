package com.nav.springcrud.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {
    @RequestMapping(method = RequestMethod.GET,value = "/hello1")
    @GetMapping("/hello1")
    public String sayHello(){
        return "hello from server";
    }
}

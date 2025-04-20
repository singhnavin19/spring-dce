package com.nav.main.service;

import org.springframework.stereotype.Component;

@Component
public class HelloInEnglish implements Hello{
    @Override
    public void hello(){
        System.out.println("hello");
    }
}

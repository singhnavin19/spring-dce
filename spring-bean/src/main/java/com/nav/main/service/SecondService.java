package com.nav.main.service;

import org.springframework.stereotype.Component;

@Component
public class SecondService {
    SecondService(){
        System.out.println("secondService called by spring");
    }
}

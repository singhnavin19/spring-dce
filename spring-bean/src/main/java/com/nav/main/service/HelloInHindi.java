package com.nav.main.service;

import org.springframework.stereotype.Component;

@Component
public class HelloInHindi implements Hello{
    @Override
    public void hello() {
        System.out.println("Namaste");
    }
}

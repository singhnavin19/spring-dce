package com.nav.main.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("helloDce")
public class HelloInEnglish implements Hello{
    @Override
    public void hello(){
        System.out.println("hello");
    }
}

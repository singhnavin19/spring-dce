package com.nav.main.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("helloDcd")
public class HelloInHindi implements Hello{
    @Override
    public void hello() {
        System.out.println("Namaste");
    }
}

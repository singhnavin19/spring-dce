package com.nav.main.injections;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class Course {
    public String name;

    public void courseName(){
        System.out.println(this.name);
    }
}

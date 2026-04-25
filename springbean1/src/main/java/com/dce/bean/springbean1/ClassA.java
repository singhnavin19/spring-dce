package com.dce.bean.springbean1;

import org.springframework.stereotype.Component;

public class ClassA {
    ClassA(){
        System.out.println("Object is created");
        System.out.println("class A ka hashcode is :- "+this.hashCode());
    }
}

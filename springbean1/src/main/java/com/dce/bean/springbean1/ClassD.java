package com.dce.bean.springbean1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassD {
    @Autowired
    ClassA classA;

    ClassD(){
        System.out.println("CLass D ka object created:- "+classA);
    }
    public void printA(){
        System.out.println(classA.hashCode());
    }

}

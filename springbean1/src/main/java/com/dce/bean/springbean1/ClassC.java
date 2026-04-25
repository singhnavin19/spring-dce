package com.dce.bean.springbean1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassC {
    @Autowired
    ClassC(ClassA classA){
        System.out.println("class C me A ka hashcode:- "+classA.hashCode());
    }
}

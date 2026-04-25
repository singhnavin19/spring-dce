package com.dce.bean.springbean1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {
//    @Autowired
//    ClassB(ClassA classA){
//        System.out.println("class B me A ka hashcode= "+classA.hashCode());
//    }
      private ClassA classA;

    public ClassA getClassA() {
        return classA;
    }

    @Autowired
    public void setClassA(ClassA classA) {
        this.classA = classA;
        System.out.println("class B me A ka hashcode :="+classA.hashCode());
    }
}

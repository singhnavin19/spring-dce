package com.nav.mcv.spring_mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CallByRef {
    static void main(String[] args) {
        int i=10;
//        incrementCallByValueNumber(10);
//        System.out.println("static i="+i); //10

        List<String> names=new ArrayList<>(Arrays.asList("Navin","Singh"));
        System.out.println("main before"+names);
        addNameInList(names);
        System.out.println("main after"+names);

    }
    static void addNameInList(List<String> names){
        names.add("Aadhya");
        System.out.println(names);

    }
    static void incrementCallByValueNumber(int i){
        i++;
        System.out.println("incrementNumber i="+i); //11
    }
}

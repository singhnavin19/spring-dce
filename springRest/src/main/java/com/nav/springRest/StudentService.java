package com.nav.springRest;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StudentService {
    public static Map<Integer,String> students=new HashMap<>();

    static {
        students.put(1,"Krishna");
        students.put(2,"Omkar P");
        students.put(3,"Ajmat");
        students.put(4,"Omkar G");
    }


}

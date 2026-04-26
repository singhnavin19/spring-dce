package com.dce.springweb;

import org.springframework.stereotype.Component;

@Component
public class NavinCompoenent {
     public PersonDetail getBasicInfo(){
        PersonDetail navin=new PersonDetail("Navin",56);
        return navin;
     }
}

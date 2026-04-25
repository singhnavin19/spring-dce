package com.dce.bean.springbean1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CLassBeanCreate {

    @Bean
    public ClassA classA(){
        return  new ClassA();
    }
}

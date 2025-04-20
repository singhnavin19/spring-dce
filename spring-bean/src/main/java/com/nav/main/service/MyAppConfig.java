package com.nav.main.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import outer.BasicCalculation;

@Configuration
@ComponentScan("outer")
public class MyAppConfig {

    @Bean
    public BasicCalculation basicCalculation(){
        return new BasicCalculation();
    }
}

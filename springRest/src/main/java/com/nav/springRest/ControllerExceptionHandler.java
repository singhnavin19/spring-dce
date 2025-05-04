package com.nav.springRest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        System.out.println("exception occured"+e.getMessage());
        return "Exception occured while processing"+e.getMessage()+" , please email your request ,we will check";
    }

}

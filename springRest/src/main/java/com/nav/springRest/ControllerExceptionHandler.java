package com.nav.springRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e){
        System.out.println("exception occured"+e.getMessage());
        return new ResponseEntity<>("Exception occured while processing"+e.getMessage()+" , please email your request ,we will check", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

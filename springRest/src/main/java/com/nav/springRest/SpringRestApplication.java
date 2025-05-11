package com.nav.springRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringRestApplication  {
	@Value("${student.name}")
	public String studentName;

	@Autowired
	public Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return (arg)->{
			System.out.println(environment.getProperty("student.name"));
//			System.out.println("property from application.proprties file is "+studentName);
		};
	}

}

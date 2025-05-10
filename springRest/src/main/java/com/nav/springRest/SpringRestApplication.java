package com.nav.springRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRestApplication  {
	@Value("${student.name}")
	public String studentName;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return (arg)->{
			System.out.println("property from application.proprties file is "+studentName);
		};
	}

}

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
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return (arg)->{
//			studentRepository.save(new StudentEntity("omkar"," G","Kandivali",123));
//			studentRepository.save(new StudentEntity("omkar"," P","borivali",123));
//			studentRepository.save(new StudentEntity("Abhinay"," T","mira road",123));
//			studentRepository.save(new StudentEntity("Krishna"," H","churchgate",123));
//			studentRepository.save(new StudentEntity("Azmat"," k","Malad",123));
		};
	}

}

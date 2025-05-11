package com.nav.springJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args->{
			studentRepository.save(new Student("Azmat"));
			studentRepository.save(new Student("Omkar G"));
			studentRepository.save(new Student("Omkar P"));
			studentRepository.save(new Student("Darshan"));
			studentRepository.save(new Student("Krishna"));
			studentRepository.save(new Student("Abhinay"));
			studentRepository.save(new Student("Navin"));
			studentRepository.save(new Student("Aadhya"));
		};
	}
}

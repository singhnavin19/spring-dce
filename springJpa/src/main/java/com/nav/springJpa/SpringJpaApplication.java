package com.nav.springJpa;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringJpaApplication {

	@Autowired
	DataSource dataSource;
	@Autowired
	StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args->{
//			insertData();
			List<StudentEntity> students=studentRepository.findAll();
			System.out.println(students);

			System.out.println(studentRepository.getStudents("navin"));
		};
	}

	private void insertData() {
		studentRepository.save(StudentEntity.builder().lastName("navin").build());
		studentRepository.save(StudentEntity.builder().lastName("navin1").build());
		studentRepository.save(StudentEntity.builder().lastName("navin2").build());
	}

}

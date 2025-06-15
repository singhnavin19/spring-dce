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
			List<StudentEntity> students=studentRepository.findAll();
			System.out.println(students);
			Optional<StudentEntity> studentEntity=studentRepository.findById(1);
			System.out.println(studentEntity.get());
		};
	}

//	private void insertData() {
//		studentRepository.save(new StudentEntity("Navin","Singh","B","Hanuman Nagar",StudentType.LATE));
//		studentRepository.save(new StudentEntity("Navin1","Singh1","B","Hanuman Nagar",StudentType.LATE));
//		studentRepository.save(new StudentEntity("Navin2","Singh2","B","Hanuman Nagar",StudentType.LATE));
//	}

}

package com.nav.jparelation;

import com.nav.jparelation.entity.StudentAddressEntity;
import com.nav.jparelation.entity.StudentEntity;
import com.nav.jparelation.repository.StudentAddressRepository;
import com.nav.jparelation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class JparelationApplication implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentAddressRepository studentAddressRepository;
	public static void main(String[] args) {
		SpringApplication.run(JparelationApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
//        createStudent();
//        List<StudentAddressEntity> addressEntities = List.of(createAdress("temp", "Mumbai-40101", 1), createAdress("temp", "Mumbai-40101", 1));
//        studentAddressRepository.saveAll(addressEntities);
//        System.out.println(addressEntities);


    }

    private static StudentAddressEntity createAdress(String addressType, String address, int sid) {
        StudentAddressEntity studentAddress=new StudentAddressEntity();
        studentAddress.setAddressType(addressType);
        studentAddress.setAddress(address);
        studentAddress.setSid(sid);
        return studentAddress;
    }

    private void createStudent() {
        StudentEntity student=new StudentEntity();
        student.setFirstName("Navin");
        student.setLastName("Singh");
        student.setDateOfBirth(LocalDate.of(1991,02,18));

        studentRepository.save(student);

        System.out.println(student);
    }
}

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
import java.util.Optional;

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
//       StudentEntity studentEntity= createStudent();
//
//        List<StudentAddressEntity> addressEntities = List.of(
//                createAdress("temp", "Mumbai-40101", 1,studentEntity),
//                createAdress("temp", "Mumbai-40101", 1,studentEntity)
//        );
//        studentEntity.setStudentAddressEntities(addressEntities);
//        studentRepository.save(studentEntity);
        //        studentAddressRepository.saveAll(addressEntities);
//        System.out.println(addressEntities);

        Optional<StudentEntity> studentEntity=studentRepository.findById(52);
        System.out.println(studentEntity.get());
    }

    private static StudentAddressEntity createAdress(String addressType, String address, int sid,StudentEntity studentEntity) {
        StudentAddressEntity studentAddress=new StudentAddressEntity();
        studentAddress.setAddressType(addressType);
        studentAddress.setAddress(address);
        studentAddress.setStudent(studentEntity);
        return studentAddress;
    }

    private StudentEntity createStudent() {
        StudentEntity student=new StudentEntity();
        student.setFirstName("Navin");
        student.setLastName("Singh");
        student.setDateOfBirth(LocalDate.of(1991,02,18));
        return student;
    }
}

package com.nav.springJpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;

@DataJpaTest(showSql = true)
@ActiveProfiles("test")
public class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    public void hello(){
        StudentEntity studentEntity = StudentEntity.builder().lastName("Navin").id(1).build();
        StudentEntity studentEntity2 = StudentEntity.builder().lastName("Navin").id(2).build();
        studentRepository.saveAllAndFlush(Arrays.asList(studentEntity,studentEntity2));
//        StudentEntity studentEntity1 = studentRepository.findAll().getFirst();
        System.out.println(studentRepository.findAll());
//        System.out.println(studentEntity1.getId());
//        System.out.println(studentRepository.findById(studentEntity.id));
//        System.out.println(studentRepository.deleteStudentByLastName(Arrays.asList("Navin")));
//        System.out.println(studentRepository.findById(studentEntity.id));
    }
}

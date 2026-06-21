package com.nav.springjpamysql;

import com.nav.springjpamysql.entity.StudentAddress;
import com.nav.springjpamysql.entity.StudentDetail;
import com.nav.springjpamysql.entity.StudentMarks;
import com.nav.springjpamysql.repository.StudentAddressRepository;
import com.nav.springjpamysql.repository.StudentDetailsRepository;
import com.nav.springjpamysql.repository.StudentMarksRepository;
import com.nav.springjpamysql.service.StudentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class SpringJpaMysqlApplication implements CommandLineRunner {

    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    @Autowired
    StudentAddressRepository studentAddressRepository;

    @Autowired
    private StudentMarksRepository studentMarksRepository;

    @Autowired
    StudentDetailService studentDetailService;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMysqlApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println(studentDetailsRepository);
        StudentDetail studentDetail=new StudentDetail("Hindi2","Navin1",2);
        studentDetailsRepository.save(studentDetail);
        StudentDetail studentDetail1=studentDetailsRepository.findById(1).get();
        System.out.println(studentDetail1);
        System.out.println(studentDetailsRepository.findByName("Navin1"));
        IO.println(studentDetailService.getNameById(1));
        IO.println(studentDetailsRepository.findAllStudentNative("Navin"));
//        List<StudentDetail> datas=studentDetailsRepository.findAll();
//        System.out.println(datas);
//
//        StudentAddress studentAddress=new StudentAddress(1,"Mumbai MH","Johnpur UP");
////        studentAddressRepository.save(studentAddress);
//
//        studentMarksRepository.save(new StudentMarks(1,"Hindi",90));
    }
}

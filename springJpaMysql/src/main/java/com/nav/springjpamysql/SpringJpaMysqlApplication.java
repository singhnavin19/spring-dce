package com.nav.springjpamysql;

import com.nav.springjpamysql.entity.StudentAddress;
import com.nav.springjpamysql.entity.StudentDetail;
import com.nav.springjpamysql.repository.StudentAddressRepository;
import com.nav.springjpamysql.repository.StudentDetailsRepository;
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
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMysqlApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println(studentDetailsRepository);
        StudentDetail studentDetail=new StudentDetail("Hindi","Navin",1);
//        studentDetailsRepository.save(studentDetail);
        List<StudentDetail> datas=studentDetailsRepository.findAll();
        System.out.println(datas);

        StudentAddress studentAddress=new StudentAddress(1,"Mumbai MH","Johnpur UP");
        studentAddressRepository.save(studentAddress);
    }
}

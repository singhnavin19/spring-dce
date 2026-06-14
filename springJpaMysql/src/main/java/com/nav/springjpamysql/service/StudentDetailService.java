package com.nav.springjpamysql.service;

import com.nav.springjpamysql.repository.StudentDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentDetailService {
    private final StudentDetailsRepository studentDetailsRepository;

    public StudentDetailService(StudentDetailsRepository studentDetailsRepository) {
        this.studentDetailsRepository = studentDetailsRepository;
    }

    public String getNameById(int id){
        return studentDetailsRepository.findName1ById(id).getName();
    }
}

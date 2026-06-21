package com.nav.springjpamysql.controller;

import com.nav.springjpamysql.entity.StudentCourse;
import com.nav.springjpamysql.model.StudentCourseDto;
import com.nav.springjpamysql.repository.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    @Autowired
    StudentCourseRepository studentCourseRepository;

    @PostMapping("/addcourse")
    public String addCourse(@RequestBody StudentCourseDto studentCourseDto){
        StudentCourse course=new StudentCourse();
        course.setCourseName(studentCourseDto.getCourseName());
        course.setSid(studentCourseDto.getSid());
        studentCourseRepository.save(course);

        return String.valueOf(course.getCourseId());
    }
}

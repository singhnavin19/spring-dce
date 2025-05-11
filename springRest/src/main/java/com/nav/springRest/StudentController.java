package com.nav.springRest;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/allStudent")
    public ResponseEntity<List<StudentEntity>> getAllStudents(){
        System.out.println(studentRepository.findAll());
        return  new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<StudentEntity> getById(@PathVariable Long id){
        Optional<StudentEntity> student=studentRepository.findById(id);
        StudentEntity studentEntity=student.get();
        if(studentEntity==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return  ResponseEntity.ok(studentEntity);
    }
    @GetMapping("/nameById/{id}")
    public String getNameById(@PathVariable Integer id){
        int i=0;
        System.out.println(10/i);
        return  studentService.getStudentById(id).getFirsName();
    }

    @GetMapping("/id")
    public Student getById1(@RequestParam("id") Integer id){
        return  studentService.getStudentById(id);
    }

    @PostMapping("/add")
    public Student addStudents(@RequestBody @Valid Student student){
        student.setId(new Random().nextInt(100));
        studentService.students.add(student);
        return student;
    }

    @PutMapping("/id/{id}")
    public Student update(@RequestBody Student student){
        Student dbStudent=studentService.getStudentById(student.getId());
        dbStudent.setFirsName(student.getFirsName());
        dbStudent.setAddress(student.getAddress());
        return dbStudent;
    }

    @DeleteMapping("/id/{id}")
    public void delete(@PathVariable  int id) throws Exception{
        studentService.deleteStudentById(id);
    }

}

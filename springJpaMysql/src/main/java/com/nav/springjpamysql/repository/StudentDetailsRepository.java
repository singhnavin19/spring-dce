package com.nav.springjpamysql.repository;

import com.nav.springjpamysql.entity.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetail,Integer> {
     StudentDetail findByName(String name);

     StudentDetail findName1ById(int id);

     @Query("select u from StudentDetail u where u.name= ?1")
     List<StudentDetail> findAllStudent(String sname);

    @Query(value = "select * from student_details u where u.name= ?1",nativeQuery = true)
    List<StudentDetail> findAllStudentNative(String sname);

}

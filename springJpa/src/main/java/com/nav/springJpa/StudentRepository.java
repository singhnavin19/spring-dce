package com.nav.springJpa;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
    @Query(value = "select u from StudentEntity u where u.lastName like :lastName%")
    public List<StudentEntity> getStudents(String lastName);

    @Modifying(flushAutomatically = true,clearAutomatically = true)
//    @Modifying
    @Transactional
    @Query(value = "delete from StudentEntity student where student.lastName in (:lastName)")
    public int deleteStudentByLastName(List<String> lastName);

}

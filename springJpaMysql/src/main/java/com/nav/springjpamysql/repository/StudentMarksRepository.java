package com.nav.springjpamysql.repository;

import com.nav.springjpamysql.entity.StudentMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMarksRepository extends JpaRepository<StudentMarks,Integer> {
}

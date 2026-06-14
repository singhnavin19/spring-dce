package com.nav.springjpamysql.repository;

import com.nav.springjpamysql.entity.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetail,Integer> {
     StudentDetail findByName(String name);

     StudentDetail findName1ById(int id);
}

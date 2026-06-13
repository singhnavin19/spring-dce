package com.nav.springjpamysql.repository;

import com.nav.springjpamysql.entity.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress,Integer> {

}

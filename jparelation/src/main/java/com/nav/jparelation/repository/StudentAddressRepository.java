package com.nav.jparelation.repository;

import com.nav.jparelation.entity.StudentAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddressEntity,Integer> {

}

package com.samjay.lesson.repository;

import com.samjay.lesson.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
    Optional<CustomerEntity> findFirsByEmail(String email);

}

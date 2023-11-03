package com.samjay.lesson.repository;

import com.samjay.lesson.entity.StudentIDCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentIdRepo extends JpaRepository<StudentIDCard,Long> {
}

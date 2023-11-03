package com.samjay.lesson.controller;

import com.samjay.lesson.entity.StudentIDCard;
import com.samjay.lesson.service.implementation.StudentIdCardImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentIdCardController {
    private StudentIdCardImpl studentIdCard;
      @Autowired
    public StudentIdCardController(StudentIdCardImpl studentIdCard) {
        this.studentIdCard = studentIdCard;
    }

    @PostMapping("/addCard/{id}")
    public StudentIDCard addCard(@RequestBody StudentIDCard studentIDCard, @PathVariable("id") Long id){
       return studentIdCard.addCard(studentIDCard,id);
    }
}

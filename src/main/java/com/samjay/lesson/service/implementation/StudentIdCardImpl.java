package com.samjay.lesson.service.implementation;

import com.samjay.lesson.entity.CustomerEntity;
import com.samjay.lesson.entity.StudentIDCard;
import com.samjay.lesson.repository.CustomerRepository;
import com.samjay.lesson.repository.StudentIdRepo;
import com.samjay.lesson.service.StudentIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentIdCardImpl implements StudentIdService {
    private StudentIdRepo studentIdRepo;
    private CustomerRepository customerRepository;
      @Autowired
    public StudentIdCardImpl(StudentIdRepo studentIdRepo, CustomerRepository customerRepository) {
        this.studentIdRepo = studentIdRepo;
        this.customerRepository = customerRepository;
    }

    @Override
    public StudentIDCard addCard(StudentIDCard studentIDCard,Long id) {
     Optional <CustomerEntity> customerId =  customerRepository.findById(id);

     if (customerId.isPresent()){
         customerId.get().setStudentIDCard(studentIDCard);
     }
        if (customerId.isPresent()){
            studentIDCard.setCustomer(customerId.get());
        }
       return studentIdRepo.save(studentIDCard);
    }
}

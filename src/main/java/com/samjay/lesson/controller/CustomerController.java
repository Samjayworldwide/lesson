package com.samjay.lesson.controller;

import com.samjay.lesson.dto.request.CustomerRequestDto;
import com.samjay.lesson.dto.response.CustomerResponseDto;
import com.samjay.lesson.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private CustomerService customerService;
       @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/welcome")
    public String welcome(){
           return "hello world";
    }

    @PostMapping(path = "/register")
    public CustomerResponseDto addCustomer(@RequestBody @Valid CustomerRequestDto customerRequestDto){
        return customerService.registerCustomer(customerRequestDto);
    }
}

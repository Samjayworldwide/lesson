package com.samjay.lesson.service;

import com.samjay.lesson.dto.request.CustomerRequestDto;
import com.samjay.lesson.dto.response.CustomerResponseDto;

public interface CustomerService {
    CustomerResponseDto registerCustomer(CustomerRequestDto customerRequestDto);

}

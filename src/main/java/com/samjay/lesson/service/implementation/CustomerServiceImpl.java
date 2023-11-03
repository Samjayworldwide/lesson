package com.samjay.lesson.service.implementation;

import com.samjay.lesson.dto.request.CustomerRequestDto;
import com.samjay.lesson.dto.response.CustomerResponseDto;
import com.samjay.lesson.entity.CustomerEntity;
import com.samjay.lesson.repository.CustomerRepository;
import com.samjay.lesson.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
      @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerResponseDto registerCustomer(CustomerRequestDto customerRequestDto) {

        if(customerRequestDto.getEmail() == null || customerRequestDto.getPassword() == null){
            throw new RuntimeException("Please input a Password and email");
        }

        if(customerRepository.findFirsByEmail(customerRequestDto.getEmail()).isPresent()){
            throw new RuntimeException("Email already exist");
        }
        else {
            ModelMapper modelMapper = new ModelMapper();
            CustomerEntity customer = new CustomerEntity();
            customer.setName(customerRequestDto.getName());
            customer.setEmail(customerRequestDto.getEmail());
            customer.setGender(customerRequestDto.getGender());
            customer.setPhoneNumber(customerRequestDto.getPhoneNumber());
            if (customerRequestDto.getPassword().equals(customerRequestDto.getRetypePassword())) {
                customer.setPassword(customerRequestDto.getPassword());
            }
            customerRepository.save(customer);
            CustomerResponseDto customerResponseDto = modelMapper.map(customerRequestDto, CustomerResponseDto.class);
            return customerResponseDto;
        }
    }
}

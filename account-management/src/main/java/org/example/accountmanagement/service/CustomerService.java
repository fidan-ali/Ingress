package org.example.accountmanagement.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.example.accountmanagement.dao.entity.Customer;
import org.example.accountmanagement.dao.repository.CustomerRepository;
import org.example.accountmanagement.mapper.CustomerMapper;
import org.example.accountmanagement.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CustomerService {
    CustomerMapper customerMapper;

    CustomerRepository customerRepository;

    public void add(CustomerDto customerDto){
        Customer customer = customerMapper.toCustomer(customerDto);
        log.info("account = {}", customer);
        customerRepository.save(customer);
    }

    public List<CustomerDto> getAll(){
        List<Customer> customers = customerRepository.findAll();
        return customerMapper.toCustomerDtoList(customers);
    }

    public CustomerDto findById(Long id){
        Customer customer = customerRepository.findById(id).orElseThrow(NullPointerException::new);
        return customerMapper.toCustomerDto(customer);
    }

    public void update(CustomerDto customerDto){
        Customer customer = customerMapper.toCustomer(customerDto);
        customerRepository.save(customer);
    }

    public void deleteById(Long id){
        customerRepository.deleteById(id);
    }
}

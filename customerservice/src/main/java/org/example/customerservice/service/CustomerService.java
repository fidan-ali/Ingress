package org.example.customerservice.service;

import lombok.RequiredArgsConstructor;
import org.example.customerservice.dto.CustomerRequest;
import org.example.customerservice.dto.CustomerResponse;
import org.example.customerservice.entity.CustomerEntity;
import org.example.customerservice.mapper.CustomerMapper;
import org.example.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerResponse createCustomer(CustomerRequest request) {
        CustomerEntity entity = CustomerMapper.mapToEntity(request);
        CustomerEntity saved = repository.save(entity);
        return CustomerMapper.mapToResponse(saved);
    }
}

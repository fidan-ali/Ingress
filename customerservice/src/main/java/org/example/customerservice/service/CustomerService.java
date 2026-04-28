package org.example.customerservice.service;

import lombok.RequiredArgsConstructor;
import org.example.customerservice.dto.CustomerRequest;
import org.example.customerservice.dao.entity.CustomerEntity;
import org.example.customerservice.dto.CustomerResponse;
import org.example.customerservice.mapper.CustomerMapper;
import org.example.customerservice.dao.repository.CustomerRepository;
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

    public CustomerResponse updateCustomer(Long customerId, CustomerRequest crd){
        var customer = fetchCustomerById(customerId);
        customer.setEmail(crd.getEmail());
        customer.setFirstName(crd.getFirstName());
        return CustomerMapper.mapToResponse(customer);
    }
    public CustomerResponse getCustomerById(Long id){
      CustomerEntity entity=  fetchCustomerById(id);
        return CustomerMapper.mapToResponse(entity);
    }
    public void deleteCustomerById(Long id) {
        repository.deleteById(id);
    }

    private CustomerEntity fetchCustomerById(Long id) {
        return repository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Customer not found with id:" + id)
                );
    }
}

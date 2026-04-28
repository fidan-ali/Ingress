package org.example.customerservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.customerservice.dao.entity.CustomerEntity;
import org.example.customerservice.dto.CustomerRequest;
import org.example.customerservice.dto.CustomerResponse;
import org.example.customerservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;
    @GetMapping
    public CustomerResponse createCustomer(CustomerRequest request){
        CustomerResponse response = service.createCustomer(request);
        return response;
    }
    @PutMapping("{id}")
    public CustomerResponse updateCustomer(@PathVariable Long customerId,  @RequestBody CustomerRequest crd){
        CustomerResponse response = service.updateCustomer(customerId, crd);
        return response;
    }
    @GetMapping
    public CustomerResponse getCustomerById(Long id){
        CustomerResponse response = service.getCustomerById(id);
        return response;

    }
    @DeleteMapping("{id}")
    public void deleteCustomerById(@PathVariable Long id){
        service.deleteCustomerById(id);
    }

}

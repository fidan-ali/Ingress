package org.example.customerservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.customerservice.dto.CustomerRequest;
import org.example.customerservice.dto.CustomerResponse;
import org.example.customerservice.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @PostMapping
    public CustomerResponse newCustomer(@RequestBody CustomerRequest request) {
        return service.createCustomer(request);
    }
}

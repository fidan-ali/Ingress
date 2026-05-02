package org.example.accountmanagement.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.accountmanagement.model.CustomerDto;
import org.example.accountmanagement.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/customers")
public class CustomerController {
    CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody CustomerDto customerDto){
        customerService.add(customerDto);
    }

    @GetMapping
    public List<CustomerDto> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    public CustomerDto findById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @PutMapping
    public void update(@RequestBody CustomerDto customerDto){
        customerService.update(customerDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id){
        customerService.deleteById(id);
    }
}

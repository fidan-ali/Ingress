package org.example.accountmanagement.mapper;

import org.example.accountmanagement.dao.entity.Customer;
import org.example.accountmanagement.model.CustomerDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDto toCustomerDto(Customer customer);
    Customer toCustomer(CustomerDto customerDto);
    List<CustomerDto> toCustomerDtoList(List<Customer> customers);
}

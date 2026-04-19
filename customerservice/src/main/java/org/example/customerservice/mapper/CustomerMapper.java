package org.example.customerservice.mapper;

import org.example.customerservice.dto.CustomerRequest;
import org.example.customerservice.dto.CustomerResponse;
import org.example.customerservice.entity.CustomerEntity;

public class CustomerMapper {
    public static CustomerEntity mapToEntity(CustomerRequest request){
        return CustomerEntity.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .build();
    }
    public static CustomerResponse mapToResponse(CustomerEntity entity){
        return CustomerResponse.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}

package org.example.accountmanagement.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CustomerDto {
    Long id;
    private String name;
    private String email;
    private String surname;
}

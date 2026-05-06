package org.example.accountmanagement.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AccountDto {
    Long id;
    private String accountNumber;
    private Double balance;

}

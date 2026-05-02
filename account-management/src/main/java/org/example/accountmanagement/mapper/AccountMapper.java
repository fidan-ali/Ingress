package org.example.accountmanagement.mapper;

import org.example.accountmanagement.dao.entity.Account;
import org.example.accountmanagement.model.AccountDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDto toAccountDto(Account account);
    Account toAccount(AccountDto accountDto);
    List<AccountDto> toAccountDtoList(List<Account> accounts);
}
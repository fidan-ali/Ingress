package org.example.accountmanagement.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.example.accountmanagement.mapper.AccountMapper;
import org.example.accountmanagement.dao.entity.Account;
import org.example.accountmanagement.model.AccountDto;
import org.example.accountmanagement.dao.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AccountService {
    AccountRepository accountRepository;
    AccountMapper accountMapper;

    public void add(AccountDto accountDto){
        Account account = accountMapper.toAccount(accountDto);
        log.info("account = {}", account);
        accountRepository.save(account);
    }

    public List<AccountDto> getAll(){
        List<Account> accounts = accountRepository.findAll();
        return accountMapper.toAccountDtoList(accounts);
    }

    public AccountDto findById(Long id){
        Account account = accountRepository.findById(id).orElseThrow(NullPointerException::new);
        return accountMapper.toAccountDto(account);
    }

    public void update(AccountDto accountDto){
        Account account = accountMapper.toAccount(accountDto);
        accountRepository.save(account);
    }

    public void deleteById(Long id){
        accountRepository.deleteById(id);
    }
}

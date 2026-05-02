package org.example.accountmanagement.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.accountmanagement.model.AccountDto;
import org.example.accountmanagement.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/accounts")
public class AccountController {
    AccountService accountService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody AccountDto accountDto){
        accountService.add(accountDto);
    }

    @GetMapping
    public List<AccountDto> getAll(){
        return accountService.getAll();
    }

    @GetMapping("/{id}")
    public AccountDto findById(@PathVariable Long id){
        return accountService.findById(id);
    }

    @PutMapping
    public void update(@RequestBody AccountDto accountDto){
        accountService.update(accountDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id){
        accountService.deleteById(id);
    }
}

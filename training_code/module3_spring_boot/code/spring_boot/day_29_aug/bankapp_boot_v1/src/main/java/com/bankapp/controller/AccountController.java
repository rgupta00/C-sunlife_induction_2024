package com.bankapp.controller;

import com.bankapp.repo.Account;
import com.bankapp.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping(path = "accounts")
    public List<Account> getAll(){
        return accountService.getAll();
    }
}

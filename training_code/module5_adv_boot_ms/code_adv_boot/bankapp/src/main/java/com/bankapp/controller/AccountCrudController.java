package com.bankapp.controller;

import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "operations")
public class AccountCrudController {
    private final AccountService accountService ;

    @GetMapping(path = "accounts")
    public List<Account> getAll(){
        return accountService.getAll();
    }
    @GetMapping(path = "accounts/{id}")
    public Account getById( @PathVariable int id){
        return accountService.getById(id);
    }
    @PostMapping(path = "accounts")
    public String addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }

    //update

    //delete account
}

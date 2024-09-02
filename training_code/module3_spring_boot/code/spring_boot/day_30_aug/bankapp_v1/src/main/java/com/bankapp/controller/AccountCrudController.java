package com.bankapp.controller;

import com.bankapp.repo.Account;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//AOP: aspect oriented programming that
//"help to write highly cohesive code"
//@ResponseBody
@RestController
public class AccountCrudController {

    private AccountService accountService;

    @Autowired
    public AccountCrudController(AccountService accountService) {
        this.accountService = accountService;
    }
    //get all account endpoint

    //ResponseEntity: bag = data + status code
    @GetMapping(path = "accounts")
    public ResponseEntity<List<Account>> getAll(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(accountService.getAll());
    }

    //get by id
    @GetMapping(path = "accounts/{id}")
    public ResponseEntity<Account> getById(@PathVariable int id){
        Account account= accountService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(account);
    }

    //add account
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "accounts")
    public String addAccount(@RequestBody Account account){
        accountService.addAccount(account);
        return  "new account is added to the database";
    }


    //delete account
    @DeleteMapping(path = "accounts/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable  int id){
        accountService.deleteAccount(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    //    @PostMapping(path = "accounts")
//    public ResponseEntity<String> addAccount(@RequestBody Account account){
//        accountService.addAccount(account);
//        String message= "new account is added to the database";
//        return ResponseEntity.status(HttpStatus.CREATED).body(message);
//    }

//    @GetMapping(path = "accounts")
//    public List<Account> getAll(){
//        return accountService.getAll();
//    }
//
//    //get by id
//    @GetMapping(path = "accounts/{id}")
//    public Account getById(@PathVariable int id){
//        return accountService.getById(id);
//    }
//
//    //add account
//    @PostMapping(path = "accounts")
//    public String addAccount(@RequestBody Account account){
//        accountService.addAccount(account);
//        return "new account is added to the database";
//    }
//    //delete account
//    @DeleteMapping(path = "accounts/{id}")
//    public String deleteAccount(@PathVariable  int id){
//        accountService.deleteAccount(id);
//        return "account is delete with id "+ id;
//    }
}

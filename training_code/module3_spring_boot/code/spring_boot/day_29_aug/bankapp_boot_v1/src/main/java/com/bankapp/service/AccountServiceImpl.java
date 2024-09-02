package com.bankapp.service;

import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repo.Account;
import com.bankapp.repo.AccountRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
//accountServiceImpl
@Service(value = "accountService")
@AllArgsConstructor
public class AccountServiceImpl implements AccountService{

    private final AccountRepo accountRepo;


    @Override
    public List<Account> getAll() {
        return accountRepo.getAll();
    }

    @Override
    public Account getById(int id) {
        Account account=accountRepo.getById(id);
        if(account==null){
            throw new BankAccountNotFoundException("bank account with id "+ id +" is not found");
        }
        return account;
    }

    @Override
    public void transfer(int fromId, int toId, double amount) {
        Account fromAcc=getById(fromId);
        Account toAcc=getById(toId);
        //BL
        fromAcc.setBalance(fromAcc.getBalance()-amount);
        toAcc.setBalance(toAcc.getBalance()+amount);
        accountRepo.update(fromAcc);
        accountRepo.update(toAcc);
    }

    @Override
    public void deposit(int id, double amount) {
        Account acc=getById(id);
        acc.setBalance(acc.getBalance()+amount);
        accountRepo.update(acc);
    }

    @Override
    public void withdraw(int id, double amount) {
        Account acc=getById(id);
        acc.setBalance(acc.getBalance()-amount);
        accountRepo.update(acc);
    }
}

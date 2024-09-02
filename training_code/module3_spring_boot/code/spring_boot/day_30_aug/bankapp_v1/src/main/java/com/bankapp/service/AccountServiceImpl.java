package com.bankapp.service;

import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repo.Account;
import com.bankapp.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{

    private AccountRepo accountRepo;

    @Autowired
    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public List<Account> getAll() {
        return accountRepo.getAll();
    }

    @Override
    public Account getById(int id) {
        Account account= accountRepo.getById(id);
        if(account==null){
            throw new BankAccountNotFoundException("account with id "+ id +" is not found");
        }
        return account;
    }

    @Override
    public void transfer(int fromId, int toId, double amount) {
        Account fromAcc=getById(fromId);
        Account toAcc=getById(toId);
        fromAcc.setBalance(fromAcc.getBalance()-amount);
        toAcc.setBalance(toAcc.getBalance()+amount);
        accountRepo.update(fromAcc);
        accountRepo.update(toAcc);
    }

    @Override
    public void deposit(int accId, double amount) {
        Account acc=getById(accId);
        acc.setBalance(acc.getBalance()+amount);
        accountRepo.update(acc);
    }

    @Override
    public void withdraw(int accId, double amount) {
        Account acc=getById(accId);
        acc.setBalance(acc.getBalance()-amount);
        accountRepo.update(acc);
    }

    @Override
    public void addAccount(Account account) {
        accountRepo.add(account);
    }

    @Override
    public void deleteAccount(int id) {
        getById(id);
        accountRepo.delete(id);
    }
}

package com.bankapp.service;

import com.bankapp.repo.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAll();
    public Account getById(int id);

    public void transfer(int fromId, int toId, double amount);
    public void deposit(int accId, double amount);
    public void withdraw(int accId, double amount);

    public void addAccount(Account account);
    public void deleteAccount(int id);
}

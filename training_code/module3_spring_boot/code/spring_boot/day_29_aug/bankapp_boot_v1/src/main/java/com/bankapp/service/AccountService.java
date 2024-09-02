package com.bankapp.service;

import com.bankapp.repo.Account;

import java.util.List;
//BL= funcational + non fuctional req(XXX ilities): brain
public interface AccountService {
    public List<Account> getAll();
    public Account getById(int id);
    public void transfer(int fromId, int toId, double amount);
    public void deposit(int id, double amount);
    public void withdraw(int id,double amount);
    //add new acc
    //update the account details
}

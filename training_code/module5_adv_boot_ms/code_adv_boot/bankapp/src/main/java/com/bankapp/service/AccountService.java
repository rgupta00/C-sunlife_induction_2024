package com.bankapp.service;

import com.bankapp.entities.Account;
import com.bankapp.exceptions.BEx;

import java.math.BigDecimal;
import java.util.List;
//BL= funcational + non fuctional req(XXX ilities): brain
public interface AccountService {
    public List<Account> getAll();
    public Account getById(int id);
    public String addAccount(Account account);
    public void transfer(int fromId, int toId, BigDecimal amount);
    public void deposit(int id, BigDecimal amount);
    public void withdraw(int id,BigDecimal amount);

    //update the account details
}

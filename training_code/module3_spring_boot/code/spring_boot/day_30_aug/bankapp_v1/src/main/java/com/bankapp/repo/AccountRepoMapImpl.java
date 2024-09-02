package com.bankapp.repo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AccountRepoMapImpl implements AccountRepo{
    public Map<Integer, Account> accountMap=new HashMap<>();
    private int counter=2;

    public AccountRepoMapImpl(){
        accountMap.put(1, new Account(1,"raj",6000.00));
        accountMap.put(2, new Account(2,"ekta",6000.00));
    }
    @Override
    public List<Account> getAll() {
        return new ArrayList<>(accountMap.values());
    }

    @Override
    public Account getById(int id) {
        return accountMap.get(id);
    }

    @Override
    public void update(Account account) {
        accountMap.put(account.getId(), account);
    }

    @Override
    public void add(Account account) {
        account.setId(++counter);
        accountMap.put(counter, account);
    }

    @Override
    public void delete(int id) {
        accountMap.remove(id);
    }
}

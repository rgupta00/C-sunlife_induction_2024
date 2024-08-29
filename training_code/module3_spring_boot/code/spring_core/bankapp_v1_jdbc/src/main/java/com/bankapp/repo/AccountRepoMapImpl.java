package com.bankapp.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
//@Profile("dev")
public class AccountRepoMapImpl implements AccountRepo{
    private Map<Integer, Account> accountMap=new HashMap<>();
    public AccountRepoMapImpl(){
        accountMap.put(1, new Account(1,"raj",3000.00));
        accountMap.put(2, new Account(2,"ekta",3000.00));
    }
    @Override
    public List<Account> getAll() {
        System.out.println("------------map wala code is running------------");
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
}

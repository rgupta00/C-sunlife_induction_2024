package com.bankapp.repo;

import java.util.List;

public interface AccountRepo {
    public List<Account> getAll();
    public Account getById(int id);
    public void update(Account account);
}

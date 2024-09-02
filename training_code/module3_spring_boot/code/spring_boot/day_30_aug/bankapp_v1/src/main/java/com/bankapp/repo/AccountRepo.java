package com.bankapp.repo;

import java.util.List;

public interface AccountRepo {
    public List<Account>getAll();
    public Account getById(int id);
    public void update(Account account);
    public void add(Account account);
    public void delete(int id);
}

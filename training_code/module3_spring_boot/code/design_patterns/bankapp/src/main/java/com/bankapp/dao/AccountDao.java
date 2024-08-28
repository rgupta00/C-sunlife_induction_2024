package com.bankapp.dao;

import java.util.List;

import com.bankapp.dto.Account;

public interface AccountDao {
	public List<Account> getAll();
	public Account getById(int id);
	public void updateAccount(int id, Account account);
	//
}

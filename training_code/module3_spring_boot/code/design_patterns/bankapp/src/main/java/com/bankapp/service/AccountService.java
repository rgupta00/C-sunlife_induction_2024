package com.bankapp.service;

import java.util.List;

import com.bankapp.dto.Account;

public interface AccountService {
	public List<Account> getAll();
	public Account getById(int id);
	public void trasfer(int fromId, int toId, double amount);
	//
	//
	
}

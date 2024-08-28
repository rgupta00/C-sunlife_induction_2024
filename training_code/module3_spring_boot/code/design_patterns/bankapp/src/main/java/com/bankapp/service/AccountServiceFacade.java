package com.bankapp.service;

import java.util.List;

import com.bankapp.dto.Account;
import com.bankapp.dto.Record;

public interface AccountServiceFacade {
	public List<Account> getAllAccounts();
	public Account getAccountById(int id);
	public void trasfer(int fromId, int toId, double amount);
	
	public List<Record> getAllRecords();
	public Record getRecordById(int id);
	public void addRecord(Record record);
	
	
}

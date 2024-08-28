package com.bankapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dto.Account;
import com.bankapp.dto.Record;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceFacade;
import com.bankapp.service.RecordService;

@Service
public class AccountServiceFacadeImpl implements AccountServiceFacade{

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private RecordService recordService;
	
	
	
	public List<Account> getAllAccounts() {
		return accountService.getAll();
	}

	public Account getAccountById(int id) {
		return accountService.getById(id);
	}

	public void trasfer(int fromId, int toId, double amount) {
		Account fromAccount=getAccountById(fromId);
	}

	public List<Record> getAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	public Record getRecordById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addRecord(Record record) {
		// TODO Auto-generated method stub
		
	}

}

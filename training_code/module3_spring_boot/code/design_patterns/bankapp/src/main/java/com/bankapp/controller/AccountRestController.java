package com.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bankapp.service.AccountService;
import com.bankapp.service.RecordService;
//:(
@Controller
public class AccountRestController {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private RecordService recordService;
	
	
}

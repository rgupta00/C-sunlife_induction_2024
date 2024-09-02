package com.bankapp.controller;

import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountTxController {
    private AccountService accountService;

    @Autowired
    public AccountTxController(AccountService accountService) {
        this.accountService = accountService;
    }
    //transfer
    //@RequestBody trigger parser (jakson) to convert json to java
    @PostMapping(path = "transfer")
    public String transfer(@RequestBody TransferDto transferDto){
        accountService.transfer(transferDto.getFromId(),
                transferDto.getToId(), transferDto.getAmount());
        return "fund transfer successfully";
    }

    //deposit
    @PostMapping(path = "deposit")
    public String deposit(@RequestBody   DepositDto depositDto){
        accountService.deposit(depositDto.getId(), depositDto.getAmount());
        return "deposit successfully";
    }
    //withdraw
    @PostMapping(path = "withdraw")
    public String withdraw(@RequestBody   WithdrawDto withdrawDto){
        accountService.withdraw(withdrawDto.getId(), withdrawDto.getAmount());
        return "withdraw successfully";
    }
}

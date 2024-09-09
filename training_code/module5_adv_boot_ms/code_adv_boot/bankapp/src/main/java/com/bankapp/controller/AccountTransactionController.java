package com.bankapp.controller;

import com.bankapp.dto.TransferDto;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.BEx;
import com.bankapp.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "transactions")
public class AccountTransactionController {

    private final AccountService accountService ;

    //transfer
    @PostMapping(path = "transfer")
    public String transfer(@RequestBody TransferDto transferDto){
         accountService.transfer(transferDto.getFromAccountId(),
                transferDto.getToAccountId(),transferDto.getAmount());
         return "fund is transfered successfully";
    }
    //deposit

    //withdraw
}

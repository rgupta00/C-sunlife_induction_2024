package com.bankapp.service;

import com.bankapp.entities.TxRecord;
import com.bankapp.exceptions.AEx;
import com.bankapp.exceptions.BEx;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.entities.Account;
import com.bankapp.repo.AccountRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
//accountServiceImpl
@Service(value = "accountService")
@AllArgsConstructor
@Transactional(isolation = Isolation.DEFAULT, readOnly = true, timeout = 2)
public class AccountServiceImpl implements AccountService{

    private final AccountRepo accountRepo;
    private final  TxRecordService txRecordService;


    @Override
    public List<Account> getAll() {
        return accountRepo.findAll();
    }

    @Override
    public Account getById(int id) {
        Account account=accountRepo
                .findById(id).orElseThrow(()->
                        new BankAccountNotFoundException("bank account with id "+ id +" is not found"));
        return account;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public String addAccount(Account account) {
        accountRepo.save(account);
        return "account is created with id "+ account.getId();
    }

    //noRollbackFor ={AEx.class} vs rollbackFor = {BEx.class}
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void transfer(int fromId, int toId, BigDecimal amount){
        Account fromAcc=getById(fromId);
        Account toAcc=getById(toId);
        //BL
        fromAcc.setBalance(fromAcc.getBalance().subtract(amount));
        accountRepo.save(fromAcc);

        toAcc.setBalance(toAcc.getBalance().add(amount));
        accountRepo.save(toAcc);
        // fromAccNumber,  toAccountNumber, amount,  authorityName, txStatus
        txRecordService.addTxRecord(new TxRecord(fromId, toId, amount, "rajiv","PENDING"));

        if(1==1){
            throw new AEx("some ex");
        }
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deposit(int id, BigDecimal amount) {
        Account acc=getById(id);
        acc.setBalance(acc.getBalance().add(amount));
        accountRepo.save(acc);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void withdraw(int id, BigDecimal amount) {
        Account acc=getById(id);
        acc.setBalance(acc.getBalance().subtract(amount));
        accountRepo.save(acc);
    }
}

package com.bankapp.service;

import com.bankapp.entities.TxRecord;
import com.bankapp.repo.TxRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TxRecordServiceImpl implements TxRecordService{

    @Autowired
    private TxRecordRepo txRecordRepo;

    @Override
    public List<TxRecord> getAll() {
        return txRecordRepo.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void addTxRecord(TxRecord txRecord) {
        txRecordRepo.save(txRecord);
    }
}

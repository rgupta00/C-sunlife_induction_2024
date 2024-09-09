package com.bankapp.service;

import com.bankapp.entities.TxRecord;

import java.util.List;

public interface TxRecordService {
    public List<TxRecord> getAll();
    public void addTxRecord(TxRecord txRecord);
}

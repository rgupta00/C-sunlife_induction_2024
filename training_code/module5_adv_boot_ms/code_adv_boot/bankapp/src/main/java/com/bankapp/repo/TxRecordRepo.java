package com.bankapp.repo;

import com.bankapp.entities.TxRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TxRecordRepo extends JpaRepository<TxRecord, Integer> {
}

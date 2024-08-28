package com.bankapp.dao;

import java.util.List;

import com.bankapp.dto.Record;

public interface RecordDao {
	public List<Record> getAll();
	public Record getById(int id);
	public void addRecord(Record record);
}

package com.bankapp.service;

import java.util.List;

import com.bankapp.dto.Record;

public interface RecordService {
	public List<Record> getAll();
	public Record getById(int id);
	public void addRecord(Record record);
}

package com.amdoc.batchprocessapp.processor;

import java.io.File;
import java.util.List;

import com.amdoc.batchprocessapp.Parser;
import com.amdoc.batchprocessapp.Record;

abstract public class BatchProcessor {
	
	abstract  public Parser getParser(File file);

	public void processBatch(String fileName) {
		
		File file = openFile();
		
		Parser parser = getParser(file);
		
		List<Record> records = parser.parse();
		
		processorRecords(records);
		writeSummray();
		closeFile();
	}

	private void processorRecords(List<Record> records) {
		System.out.println("processing each record to db");
	}

	private void writeSummray() {
		System.out.println("writing summery report");
	}

	private void closeFile() {
		System.out.println("closing the file...");
	}

	private File openFile() {
		System.out.println("open the file...");
		return null;
	}
}
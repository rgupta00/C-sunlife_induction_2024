package com.amdoc.batchprocessapp.processor.impl;

import java.io.File;

import com.amdoc.batchprocessapp.CsvParser;
import com.amdoc.batchprocessapp.Parser;
import com.amdoc.batchprocessapp.processor.BatchProcessor;


public class CsvBatchProcessor extends BatchProcessor {

	@Override
	public Parser getParser(File file) {
		return new CsvParser(file);
	}


}

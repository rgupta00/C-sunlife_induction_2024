package com.amdoc.batchprocessapp.processor.impl;

import java.io.File;

import com.amdoc.batchprocessapp.Parser;
import com.amdoc.batchprocessapp.PdfParser;
import com.amdoc.batchprocessapp.processor.BatchProcessor;

public class PdfBatchProcessor extends BatchProcessor {

	@Override
	public Parser getParser(File file) {
		return new PdfParser(file);
	}

	

}

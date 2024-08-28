package com.amdoc.batchprocessapp.processor.impl;

import java.io.File;

import com.amdoc.batchprocessapp.Parser;
import com.amdoc.batchprocessapp.TextParser;
import com.amdoc.batchprocessapp.processor.BatchProcessor;

public class TextBatchProcessor extends BatchProcessor {

	@Override
	public Parser getParser(File file) {
		return new TextParser(file);
	}


}

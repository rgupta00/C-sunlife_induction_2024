package com.amdoc.batchprocessapp;

import com.amdoc.batchprocessapp.processor.BatchProcessor;
import com.amdoc.batchprocessapp.processor.impl.TextBatchProcessor;

public class DemoFactoryMethod {

	public static void main(String[] args) {

		BatchProcessor batchProcessor = new TextBatchProcessor();
		batchProcessor.processBatch("empdata");
	}

}

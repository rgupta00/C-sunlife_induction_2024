package com.amdoc.batchprocessapp;

import java.io.File;
import java.util.List;

public class CsvParser implements Parser{

	public CsvParser(File file) {
		System.out.println("creating csv parser...");
	}

	public List<Record> parse() {
		System.out.println("creating record list using csv parser...");
		//
		return null;
	}

}
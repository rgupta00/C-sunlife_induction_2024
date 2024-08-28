package com.amdoc.batchprocessapp;

import java.io.File;
import java.util.List;

public class PdfParser implements Parser{

	public PdfParser(File file) {
		System.out.println("creating pdf parser...");
	}

	public List<Record> parse() {
		System.out.println("creating record list using pdf parser...");
		//
		return null;
	}

}
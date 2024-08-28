package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

 public class BookDaoImpl implements BookDao {
	@Override
	public List<String> getAll() {
		log();
		return null;
	}

	 void log() {
		System.out.println("----some logging----");
	}

}

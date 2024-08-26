package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

public class BookDaoImpl implements BookDao {
	@Override
	public List<String> getBooks() {
		System.out.println("hello");
		logs();
		return null;
	}

	public void logs() {
		System.out.println("-------------------");
	}
}
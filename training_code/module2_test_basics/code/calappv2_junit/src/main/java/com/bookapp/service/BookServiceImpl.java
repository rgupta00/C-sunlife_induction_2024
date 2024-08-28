package com.bookapp.service;

import java.util.List;

import com.bookapp.dao.BookDao;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	public BookServiceImpl(BookDao bookDao) {
		System.out.println(bookDao.getClass());
		this.bookDao = bookDao;
	}


	@Override
	public List<String> getAllBooksOnSubject(String subject){
		return bookDao.getAll().stream().filter(b->b.contains(subject)).toList();
	}
}

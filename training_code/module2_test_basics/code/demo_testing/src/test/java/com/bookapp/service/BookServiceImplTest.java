package com.bookapp.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bookapp.dao.BookDao;

class BookServiceImplTest {

	BookDao dao = mock(BookDao.class);

	BookServiceImpl bookService = new BookServiceImpl();

	@BeforeEach
	public void before() {
		List<String> allbooks = Arrays.asList("java", "rich dad poor dad", "java adv");

		when(dao.getBooks()).thenReturn(allbooks);
		
	}

	@Test
	public void getBookTest() {

		bookService.setBookDao(dao);
		List<String> books = bookService.getBooks("java");
		Assertions.assertEquals(2, books.size());
	}

}

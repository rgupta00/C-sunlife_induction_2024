package com.bookapp.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.dao.BookDao;

@ExtendWith(MockitoExtension.class)
class BookServiceImplMockitoUnitTest {

	@Mock
	//@Spy
	private BookDao bookDao;// it is a fake object with out any behaviour
	
	@InjectMocks
	private BookServiceImpl bookService;
	
	@BeforeEach
	void setUp() throws Exception {
		//Set the behaiour to the dao layer
		System.out.println(bookDao.getClass());
		List<String> books=Arrays.asList("java","rich dad poor dad","adv java");
		when(bookDao.getBooks()).thenReturn(books);
	}
	
	@Test
	void getBooksAsPerSubject() {
		assertEquals(bookService.getBooks("java").size(), 2);
	}

	@AfterEach
	void tearDown() throws Exception {
		bookDao=null;
		bookService=null;
	}



}

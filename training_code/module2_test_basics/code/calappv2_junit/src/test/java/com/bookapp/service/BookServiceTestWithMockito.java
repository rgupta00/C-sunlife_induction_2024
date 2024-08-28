package com.bookapp.service;

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

import static org.mockito.Mockito.*;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

@ExtendWith(MockitoExtension.class)
class BookServiceTestWithMockito {
//
//    @Mock
//	private BookDao bookDao;
	

    @Spy
	private BookDaoImpl bookDao;
	
	@InjectMocks
	private BookServiceImpl bookService;
	
	
	@Test
	public void bookTest() {
		//Given when then
		List<String> books=Arrays.asList("java","adv java","rich dad poor dad");
		
		when(bookDao.getAll()).thenReturn(books);
		
		
		Assertions.assertEquals(2, bookService.getAllBooksOnSubject("java").size());
	}
	@AfterEach
	void tearDown() throws Exception {
		bookDao=null;
		bookService=null;
	}
}

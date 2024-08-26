//package com.bookapp.service;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import com.bookapp.dao.BookDao;
//import com.bookapp.dao.BookDaoImpl;
//
//class BookServiceImplIntegrationTest {
//
//	private BookDao bookDao;
//	private BookService bookService;
//	@BeforeEach
//	void setUp() throws Exception {
//		bookDao=new BookDaoImpl();
//		bookService=new BookServiceImpl(bookDao);//this become actually integration test : unit test :(
//	}
//	
//	@Test
//	void getBooksAsPerSubject() {
//		assertEquals(bookService.getBooks("java").size(), 2);
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//		bookDao=null;
//		bookService=null;
//	}
//
//
//
//}

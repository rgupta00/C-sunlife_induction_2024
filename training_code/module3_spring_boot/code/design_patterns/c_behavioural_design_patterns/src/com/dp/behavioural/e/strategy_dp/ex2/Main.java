package com.dp.behavioural.e.strategy_dp.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		//let assume i have a list of books
		List<Book> books=new ArrayList<>();
		//
		
		BookService bookService=new BookService();
		List<Book> costlyBooks=bookService.getBooksOnPredicate(books, b->b.getPrice()>=1000);
		
		List<Book> javaBooks=bookService.getBooksOnPredicate(books, 
				b->b.getName().contains("java"));
		
	}
}

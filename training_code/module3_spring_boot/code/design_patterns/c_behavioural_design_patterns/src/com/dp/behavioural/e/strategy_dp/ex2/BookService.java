package com.dp.behavioural.e.strategy_dp.ex2;

import java.util.List;
import java.util.function.Predicate;

//OCP
public class BookService {
	// behavoiural parameterization? LW strategy pattern
	public List<Book> getBooksOnPredicate(List<Book> books, Predicate<Book> predicate) {
		return books.stream().filter(predicate).toList();
	}
}

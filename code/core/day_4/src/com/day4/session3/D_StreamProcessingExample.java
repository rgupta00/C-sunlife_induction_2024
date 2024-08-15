package com.day4.session3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class D_StreamProcessingExample {

	public static void main(String[] args) {
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 940),
						new Book(121, "java advance", "gunika", 1540),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 300));
		
		
		//print name of java books sorted as per price
		
		//java 8: declative data processing as happends in SQL
		List<String> names=books.stream()
				.sorted(Comparator.comparing(Book::getPrice).reversed())
				.filter(b->b.getTitle().contains("java"))
				.map(b->b.getTitle())
				.collect(Collectors.toList());
		names.forEach(name-> System.out.println(name));
		
		
		//java 7
		
//		Collections.sort(books, new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//				return Double.compare(o2.getPrice(), o1.getPrice());
//			}
//		});
//		List<Book> javaBooks=new ArrayList<>();
//		for(Book book: books) {
//			if(book.getTitle().contains("java")) {
//				javaBooks.add(book);
//			}
//		}
//		
//		List<String> names=new ArrayList<>();
//		for(Book book: javaBooks) {
//			names.add(book.getTitle());
//		}
//		
//		//print all books
//		for(String name: names) {
//			System.out.println(name);
//		}
	}
}

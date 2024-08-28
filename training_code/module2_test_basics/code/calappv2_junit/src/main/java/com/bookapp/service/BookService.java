package com.bookapp.service;

import java.util.List;

public interface BookService {
	List<String> getAllBooksOnSubject(String subject);
}
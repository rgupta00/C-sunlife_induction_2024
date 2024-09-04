package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.service.BookService;

@Controller
public class BookController {
	
	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService=bookService;
	}

	@GetMapping(path="allbooks")
	public ModelAndView showAll() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("show");
		mv.addObject("books", bookService.getAllBooks());
		return mv;
	}
}

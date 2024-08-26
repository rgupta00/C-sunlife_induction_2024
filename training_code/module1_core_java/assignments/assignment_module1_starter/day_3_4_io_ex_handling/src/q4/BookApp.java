package q4;

import java.util.*;
import java.io.*;

public class BookApp {
	private List<Book> books;

	public BookApp() {
		books = new ArrayList<Book>();
		init();
	}

	//TODO reading the data from the file and populating the arraylist
	private void init() {
		
	}

	public Book searchBook(int bookId) {
		boolean isFond = false;
		Book bookFound = null;
		for (Book book : books) {
			if (book.getId() == bookId) {
				isFond = true;
				bookFound = book;
				break;
			}
		}
		if (isFond)
			return bookFound;
		else
			throw new BookNotFoundException();
	}

	public void sellBook(String isbn, int noOfCopies) {
	}

	public void purchageBook(String isbn, int noOfCopies) {

	}

}

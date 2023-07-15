/**
 * 
 */
package com.rest.test.service;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.rest.test.entities.Book;

/**
 * @author AR
 *
 */
@Component
public class BookService {
	private static List<Book> list = new ArrayList<Book>();

	static {

		Book book1 = new Book(1, "Mastan", null);
		Book book2 = new Book(2, "Ali", null);
		Book book3 = new Book(3, "Anwar", null);
		Book book4 = new Book(4, "Pathan Mastan", null);
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
	}

	// get single id
	public Book getBookById(int id) {
		Book book = null;
		try {
			book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	// read i.e(get all books)

	public List<Book> getAllBooks() {
		return list;
	}

	// create i.e (adding a book)

	public Book addBook(Book b) {

		list.add(b);
		return b;
	}

	// delete i.e(delete a book)

	public void deleteBook(int bookId) {
		list = list.stream().filter(book -> book.getId() != bookId).collect(Collectors.toList());

	}

	// update i.e(update a book)

	public Book updateBook(Book book, int bookId) {
		list = list.stream().map(b -> {
			if (b.getId() == bookId) {
				b.setAuthor(book.getAuthor());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
		return book;

	}

}

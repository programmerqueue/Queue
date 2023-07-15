/**
 * 
 */
package com.rest.test.controller;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.test.entities.Author;
import com.rest.test.entities.Book;
import com.rest.test.service.BookService;

/**
 * @author AR
 *
 */
@RestController
public class BookController {
	@Autowired
	BookService bookService;

//	@RequestMapping(value = "/books", method = RequestMethod.GET)
	@GetMapping("/book1")
	public Book getBooks() {
		Book book = new Book();
		Author author = new Author();
		author.setAuthor_id(1);
		author.setFirstname("makrani");
		author.setLastname("shaikh");
		author.setLanguage("hindi");
		book.setId(6);
		book.setTitle("Java");
		book.setAuthor(author);

		return book;
	}

	// get single book handler

	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getSingleBookId(@PathVariable("id") int id) {
		Book book = this.bookService.getBookById(id);
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}

	// read i.e(get all books)

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks1() {
		List<Book> list = this.bookService.getAllBooks();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
//	create i.e(add a book)

	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book b = null;
		try {
			b = this.bookService.addBook(book);
			System.out.println(book);
			return ResponseEntity.of(Optional.of(b));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

//	delete i.e(delete a single book using book of id)

	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<?> deleteBook(@PathVariable("bookId") int bookId) {
		try {
			this.bookService.deleteBook(bookId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	// update i.e(update a book)
	@PutMapping("/books/{bookId}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
		try {
			this.bookService.updateBook(book, bookId);
			System.out.println(book);
			return ResponseEntity.status(HttpStatus.OK).body(book);
		} catch (Exception e) {

			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
}

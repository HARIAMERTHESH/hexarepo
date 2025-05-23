package com.bookapp.dao;

import com.bookapp.model.Book;

public interface IBookDao {
	
	void addBook(Book book);
	void updateBook(int bookId, double price);
	void deleteBook(int bookId);
	
	Book getById(int bookId);
	List<Book> getAllBooks();
	List<Book> getByAuthor(String author);
}

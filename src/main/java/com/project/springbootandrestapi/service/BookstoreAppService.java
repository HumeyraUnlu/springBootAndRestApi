package com.project.springbootandrestapi.service;

import java.util.List;

import com.project.springbootandrestapi.entities.BookstoreApp;

public interface BookstoreAppService {
	List<BookstoreApp> getAll();
	void add(BookstoreApp book);
	void update(BookstoreApp book);
	void delete(BookstoreApp book);
	public List<BookstoreApp> getCategory(String category);
	public List<BookstoreApp> getBookStore(String bookStore);

}

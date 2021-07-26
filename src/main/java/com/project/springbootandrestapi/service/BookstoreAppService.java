package com.project.springbootandrestapi.service;

import java.util.List;

import com.project.springbootandrestapi.entities.*;

public interface BookstoreAppService {
	
	public List<BookstoreApp> getAll();
	public BookstoreApp getById(int id);
	void add(BookstoreApp book);
	void update(BookstoreApp book);
	void delete(BookstoreApp book);
	public List<String> getCategories();	
	public List<BookstoreApp> getCategory(String category);
	public List<String> getBookStores();
	public List<BookstoreApp> getBookStore(String bookStore);
	public List<BookstoreApp> getBookPrices(String name);
}

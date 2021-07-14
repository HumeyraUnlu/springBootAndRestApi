package com.project.springbootandrestapi.dao;
import java.util.List;
import com.project.springbootandrestapi.entities.*;

public interface BookstoreAppDao {
	
	List<BookstoreApp> getAll();
	void add(BookstoreApp book);
	void update(BookstoreApp book);
	void delete(BookstoreApp book);
	List<String> getCategories();
	public List<BookstoreApp> getCategory(String category);
	List<String> getBookStores();
	public List<BookstoreApp> getBookStore(String bookStore);

}

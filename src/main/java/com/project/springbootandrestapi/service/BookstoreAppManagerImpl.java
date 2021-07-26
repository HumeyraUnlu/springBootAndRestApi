package com.project.springbootandrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.project.springbootandrestapi.dao.BookstoreAppDao;
import com.project.springbootandrestapi.entities.BookstoreApp;

@Service
public class BookstoreAppManagerImpl implements BookstoreAppService {

	private BookstoreAppDao bookstoreAppDao;

	@Autowired
	public BookstoreAppManagerImpl(BookstoreAppDao bookstoreAppDao) {
		this.bookstoreAppDao = bookstoreAppDao;
	}

	@Override
	@Transactional
	public List<BookstoreApp> getAll() {
		return this.bookstoreAppDao.getAll();
	}

	@Override
	public BookstoreApp getById(int id) {
		return this.bookstoreAppDao.getById(id);

	}

	@Override
	@Transactional
	public void add(BookstoreApp book) {
		this.bookstoreAppDao.add(book);
	}

	@Override
	@Transactional
	public void update(BookstoreApp book) {
		this.bookstoreAppDao.update(book);
	}

	@Override
	@Transactional
	public void delete(BookstoreApp book) {
			this.bookstoreAppDao.delete(book);
		

	}

	@Override
	public List<BookstoreApp> getCategory(String category) {
		return this.bookstoreAppDao.getCategory(category);
	}

	@Override
	public List<BookstoreApp> getBookStore(String bookStore) {
		return this.bookstoreAppDao.getBookStore(bookStore);
	}

	@Override
	@Transactional
	public List<String> getCategories() {
		return this.bookstoreAppDao.getCategories();
	}

	@Override
	@Transactional
	public List<String> getBookStores() {
		return this.bookstoreAppDao.getBookStores();
	}

	@Override
	public List<BookstoreApp> getBookPrices(String name) {
		return this.bookstoreAppDao.getBookPrices(name);
	}

}

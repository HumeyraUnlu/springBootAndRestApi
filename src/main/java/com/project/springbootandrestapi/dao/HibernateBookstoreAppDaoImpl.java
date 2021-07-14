package com.project.springbootandrestapi.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.project.springbootandrestapi.entities.BookstoreApp;

@Repository
public class HibernateBookstoreAppDaoImpl implements BookstoreAppDao{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateBookstoreAppDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional 
	public List<BookstoreApp> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<BookstoreApp> books = session.createQuery("from BookstoreApp", BookstoreApp.class).getResultList();
		return books;
	}

	@Override
	public void add(BookstoreApp book) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(book);
	}

	@Override
	public void update(BookstoreApp book) {
		
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(book);
	}

	@Override
	public void delete(BookstoreApp book) {	
		Session session = entityManager.unwrap(Session.class);
		BookstoreApp bookToDelete=session.get(BookstoreApp.class, book.getId());
		session.delete(bookToDelete);
	}

	@Override
	@Transactional 
	public List<String> getCategories() {
		Session session = entityManager.unwrap(Session.class);
		List<String> books = session.createQuery("SELECT category  from BookstoreApp group by category", String.class).getResultList();
		return books;
	}
	
	@Override
	@Transactional
	public List<BookstoreApp> getCategory(String category) {
		Session session = entityManager.unwrap(Session.class);
		List<BookstoreApp> books = session.createQuery
				("from BookstoreApp where category='"+category+"' ", BookstoreApp.class).getResultList();
		return books;                                                           
	}
	
	@Override
	@Transactional 
	public List<String> getBookStores() {
		Session session = entityManager.unwrap(Session.class);
		List<String> books = session.createQuery("SELECT bookstore  from BookstoreApp group by bookstore", String.class).getResultList();
		return books;
	}
	
	
	@Override
	public List<BookstoreApp> getBookStore(String bookStore) {
		Session session = entityManager.unwrap(Session.class);
		List<BookstoreApp> books = session.createQuery
				("from BookstoreApp where bookstore='"+bookStore+"' ", BookstoreApp.class).getResultList();
		return books;   
	}



	
	
	
}

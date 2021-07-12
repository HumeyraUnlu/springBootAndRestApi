package com.project.springbootandrestapi.entities;
import javax.persistence.*;

@Entity
@Table(name="bookstoreapp")
public class BookstoreApp {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="category")
	private String category;
	
	@Column(name="price")
	private String price;
	
	@Column(name="bookstore")
	private String bookstore;
	
	@Column(name="bookstorecity")
	private String bookstoreCity;
	
	public BookstoreApp(int id, String name,String category, String price, String bookstore, String bookstoreCity) {
		this.id = id;
		this.name=name;
		this.category = category;
		this.price = price;
		this.bookstore = bookstore;
		this.bookstoreCity = bookstoreCity;
	}
	
	public BookstoreApp() {
		
	}
	

	public 	int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBookstore() {
		return bookstore;
	}

	public void setBookstore(String bookstore) {
		this.bookstore = bookstore;
	}

	public String getBookstoreCity() {
		return bookstoreCity;
	}

	public void setBookstoreCity(String bookstoreCity) {
		this.bookstoreCity = bookstoreCity;
	}
	
	

	
}

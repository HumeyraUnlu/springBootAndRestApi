package com.project.springbootandrestapi.restApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.springbootandrestapi.entities.*;
import com.project.springbootandrestapi.service.BookstoreAppService;

@RestController
@RequestMapping("/api") 
public class BooksController {
	
	private BookstoreAppService bookstoreAppService;
	
	@Autowired
	public BooksController(BookstoreAppService bookstoreAppService) {
		this.bookstoreAppService = bookstoreAppService;
	}
	
	@GetMapping("/books")
	public List<BookstoreApp> getAll(){
		return bookstoreAppService.getAll();
	}
	
	@GetMapping("/books/{id}")
	public BookstoreApp getById(@PathVariable int id){
		return bookstoreAppService.getById(id);
	}	
	
	@GetMapping("/books/prices/{name}")
	public List<BookstoreApp> getBookPrices(@PathVariable String name){
		return bookstoreAppService.getBookPrices(name);
	}
}

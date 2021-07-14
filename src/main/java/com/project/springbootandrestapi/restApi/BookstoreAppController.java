package com.project.springbootandrestapi.restApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.springbootandrestapi.entities.*;
import com.project.springbootandrestapi.service.BookstoreAppService;

@RestController
@RequestMapping("/api") 
public class BookstoreAppController {
	
	private BookstoreAppService bookstoreAppService;

	@Autowired
	public BookstoreAppController(BookstoreAppService bookstoreAppService) {
		this.bookstoreAppService = bookstoreAppService;
	}
	
	@GetMapping("/books")
	public List<BookstoreApp> get(){
		return bookstoreAppService.getAll();
	}
	
	@GetMapping("/category")
	public List<String> getCategories(){
		return bookstoreAppService.getCategories();
	}
	
	@GetMapping("/category/{category}")
	public List<BookstoreApp> getCategory(@PathVariable String category){
		return bookstoreAppService.getCategory(category);
	}
	
	@GetMapping("/bookstore")
	public List<String> getBookStores(){
		return bookstoreAppService.getBookStores();
	}
	
	@GetMapping("/bookstore/{bookStore}")
	public List<BookstoreApp> getBookStore(@PathVariable String bookStore){
		return bookstoreAppService.getBookStore(bookStore);
	}
	
	@PostMapping("/bookstore/{bookStore}/add")
	public void addToBookStore(@RequestBody BookstoreApp book) {
		bookstoreAppService.add(book);
	}
	
	@PostMapping("/bookstore/{bookStore}/delete")
	public void deleteToFromBookStore(@RequestBody BookstoreApp book) {
		bookstoreAppService.delete(book);
	}
	
	@PostMapping("/bookstore/{bookStore}/update")
	public void updateCategory(@RequestBody BookstoreApp book) {
		bookstoreAppService.update(book);
	}
	
}

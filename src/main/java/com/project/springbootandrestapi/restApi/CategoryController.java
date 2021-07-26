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
public class CategoryController {
	
	private BookstoreAppService bookstoreAppService;
	
	@Autowired
	public CategoryController(BookstoreAppService bookstoreAppService) {
		this.bookstoreAppService = bookstoreAppService;
	}
	
	@GetMapping("/category")
	public List<String> getCategories(){
		return bookstoreAppService.getCategories();
	}
	
	@GetMapping("/category/{category}")
	public List<BookstoreApp> getCategory(@PathVariable String category){
		return bookstoreAppService.getCategory(category);
	}
	
	@GetMapping("/category/{category}/{id}")
	public BookstoreApp getById(@PathVariable int id){
		return bookstoreAppService.getById(id);
	}	

}

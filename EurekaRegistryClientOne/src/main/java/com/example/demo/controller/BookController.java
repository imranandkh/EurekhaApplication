package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domian.Book;

@RestController
public class BookController {

	
	@GetMapping("/clientOne")
	public List<Book> getBooks(){
		
		List<Book> bookList=new ArrayList<Book>();
		
		Book bookOne=new Book();
		bookOne.setName("Java");
		bookOne.setPrice("2222");
		
		Book bookTwo=new Book();
		
		bookTwo.setName("Spring");
		bookTwo.setPrice("3456");
		
		bookList.add(bookTwo);
		bookList.add(bookOne);
		
		return bookList;
	}
}

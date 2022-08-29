package com.globallogic.book.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.book.entity.Book;
import com.globallogic.book.service.bookserv;

@RestController
@RequestMapping("/book")
public class Bookcon {

	

	@Autowired 
	bookserv ser;
	
	@PostMapping("/")
	public String addbook(@RequestBody Book u)
	{
		return ser.addbook(u);
		
	}
	
	@GetMapping("/all")
	public List<Book> alluser()
	{
		return ser.display();
	}
	
	@PutMapping("/")
	public String updatebook(@RequestBody Book u)
	{
		return ser.update(u);
	}
	

	@DeleteMapping("/{id}")
	public String deletbook(@PathVariable("id") long id)
	{
		return ser.delete(id);
	}
	
}

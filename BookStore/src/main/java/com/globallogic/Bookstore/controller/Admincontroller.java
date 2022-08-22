package com.globallogic.Bookstore.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Bookstore.repo.Bookstorerepo;
import com.globalogic.Bookstore.entity.Bookstore;

@RestController
@RequestMapping("/admin")
public class Admincontroller {
	
	@Autowired
	Bookstorerepo repo;
	
	@GetMapping("/")
	public List<Bookstore> showBooks()
	{
		return repo.findAll();
	}
	
	@PutMapping("/addBook")
	public Bookstore addBook(@RequestBody Bookstore b1)
	{
		
		repo.save(b1);
		return b1;
	}
	
	@DeleteMapping("/deleteBook/id/{id}")
	public List<Bookstore> deleteBook(@PathVariable("id") int id)
	{
		
		repo.deleteById(id);
		return repo.findAll();
	}
	
	@PutMapping("/updateBook")
	public Bookstore updateBook(@RequestBody Bookstore b1)
	{
		
		repo.save(b1);
		return b1;
	}

}

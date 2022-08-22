package com.globallogic.Online.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.Online.entity.BookEntity;
import com.globallogic.Online.repo.BookRepo;


@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	BookRepo repo;
	@GetMapping("/")
	public List<BookEntity> showBook()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public BookEntity saveEmp(@RequestBody BookEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public BookEntity updateBook(@RequestBody BookEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable("id") long id)
	{
    	System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted!";
	}
    @GetMapping("/name/{name}")
    public List<BookEntity> getEmpByName(@PathVariable("name") String name)
    {
    	return repo.findByName(name);
    }
}

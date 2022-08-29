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

import com.globallogic.book.entity.Signup;
import com.globallogic.book.service.signupserv;

@RestController
@RequestMapping("/signup")
public class Signupcon {
	
	@Autowired 
	signupserv ser;
	

	
	@PostMapping("/")
	public String addUser(@RequestBody Signup u)
	{
		return ser.signin(u);
		
	}
	
	@GetMapping("/all")
	public List<Signup> alluser()
	{
		return ser.showdet();
	}
	
	@PutMapping("/")
	public String updateUser(@RequestBody Signup u)
	{
		return ser.update(u);
	}
	
	@DeleteMapping("/{id}")
	public String deletuser(@PathVariable("id") long id)
	{
		return ser.delete(id);
}
}

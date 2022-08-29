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

import com.globallogic.book.entity.Admin;
import com.globallogic.book.service.adminserv;
import com.globallogic.book.service.signupserv;


@RestController
@RequestMapping("/admin")
public class Admincon {

	
	@Autowired 
	adminserv ser;
	
	@Autowired
	signupserv se;
	@PostMapping("/")
	public String addUser(@RequestBody Admin u)
	{
		return ser.admi(u);
		
	}
	
	@GetMapping("/all")
	public List<Admin> alluser()
	{
		return ser.showdet();
	}
	
	@PutMapping("/")
	public String updateUser(@RequestBody Admin u)
	{
		return ser.update(u);
	}
	
	
	
	@DeleteMapping("/{id}")
	public String deletuser(@PathVariable("id") long id)
	{
		return ser.delete(id);
}
	
	@GetMapping("/{id}/{email}/{pass}")
	public String loginauthen(@PathVariable("id") long id,@PathVariable("email") String email,@PathVariable("pass") String pass) {
		return ser.sucessSignin(id, email, pass);
	}
}

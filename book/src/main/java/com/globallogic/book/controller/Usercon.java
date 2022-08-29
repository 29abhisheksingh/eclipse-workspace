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

import com.globallogic.book.entity.User;
import com.globallogic.book.service.userserv;

@RestController
@RequestMapping("/user")
public class Usercon {

	
	@Autowired 
	userserv ser;
	
	
	@GetMapping("/{id}/{email}/{pass}")
	public String loginauthen(@PathVariable("id") long id,@PathVariable("email") String email,@PathVariable("pass") String pass) {
		return ser.sucessSignin(id, email, pass);
	}
	@PostMapping("/")
	public String addUser(@RequestBody User u)
	{
		return ser.use(u);
		
	}
	
	@PutMapping("/")
	public String updateUser(@RequestBody User u)
	{
		return ser.update(u);
	}
	
	@DeleteMapping("/{id}")
	public String deletuser(@PathVariable("id") long id)
	{
		return ser.delete(id);
}
	
	@GetMapping("/all")
	public List<User> alluser()
	{
		return ser.showdet();
	}
}


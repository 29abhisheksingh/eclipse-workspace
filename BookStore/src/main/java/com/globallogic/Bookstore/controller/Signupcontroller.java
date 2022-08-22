package com.globallogic.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Bookstore.repo.Signuprepo;
import com.globalogic.Bookstore.entity.Signup;

@RestController
@RequestMapping("/signup")
public class Signupcontroller {
	
	
	@Autowired
	Signuprepo repo;
	
	@PostMapping("/signup/email/{email}/password/{password}")
	public Signup addUser(@PathVariable("email") String email, @PathVariable("password")String password)
	{
		Signup s =new Signup();
		s.setEmail(email);
		s.setPassword(password);
		return repo.save(s);
		
	}
	
	/*@GetMapping("/login/email/{email}/password/{password}")
	public void loginUser(@PathVariable("email") String email, @PathVariable("password")String password)
	{
		Signup s =new Signup();
		List<String> s =
		for(String str: )
		{
			if(str.equals(email)) {
				
			}
		}
	}*/

}

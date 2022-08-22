package com.globallogic.Online.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.Online.entity.UserEntity;
import com.globallogic.Online.repo.UserRepo;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserRepo repo;
	@GetMapping("/")
	public List<UserEntity> showUser()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public UserEntity saveUser(@RequestBody UserEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}   
	@PutMapping("/")
    public UserEntity updateUser(@RequestBody UserEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") long id)
	{
    	System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted!";
	}
    @GetMapping("/name/{name}")
    public List<UserEntity> getUserByName(@PathVariable("name") String name)
    {
    	return repo.findByName(name);
    }

}

package com.globallogic.Portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Portal.entity.AdminEntity;
import com.globallogic.Portal.repo.AdminRepo;

@RestController
@RequestMapping("adm")
public class AdminController {
	@Autowired
	AdminRepo repo;
	@GetMapping("/")
	public List<AdminEntity> showAdmin()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public AdminEntity saveAdmin(@RequestBody AdminEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public AdminEntity updateAdmin(@RequestBody AdminEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
   
    


}

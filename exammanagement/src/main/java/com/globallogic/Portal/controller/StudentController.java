package com.globallogic.Portal.controller;

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

import com.globallogic.Portal.entity.StudentEntity;
import com.globallogic.Portal.repo.StudentRepo;

@RestController
@RequestMapping("/stu")
public class StudentController {
	@Autowired
	StudentRepo repo;
	@GetMapping("/")
	public List<StudentEntity> showStudent()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public StudentEntity saveStudent(@RequestBody StudentEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public StudentEntity updateStudent(@RequestBody StudentEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") long id)
	{
    	System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted!";
	}
    


}

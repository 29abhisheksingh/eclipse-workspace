package com.globallogic.Portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.globallogic.Portal.entity.ExamEntity;
import com.globallogic.Portal.repo.ExamRepo;

@RestController
@RequestMapping("/exam")
public class ExamController {
	@Autowired 
	ExamRepo repo;
	@GetMapping("/")
	public List<ExamEntity> showExam()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public ExamEntity saveExam(@RequestBody ExamEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public ExamEntity updateExam(@RequestBody ExamEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}

}

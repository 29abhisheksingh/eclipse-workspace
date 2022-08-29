package com.globallogic.Portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Portal.entity.ResultEntity;
import com.globallogic.Portal.repo.ResultRepo;

@RestController
@RequestMapping("/res")
public class ResultController {
	@Autowired
	ResultRepo repo;
	@GetMapping("/")
	public List<ResultEntity> showResult()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public ResultEntity saveResult(@RequestBody ResultEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public ResultEntity updateResult(@RequestBody ResultEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}

}

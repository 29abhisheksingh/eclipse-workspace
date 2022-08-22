package com.globallogic.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Homecontroller {
	
	@GetMapping("")
	public String showMSG() {
		return "spring boot get";
		
	}
	@PostMapping("/")
	public String showPostMSG()
	{
		return "spring boot post";
	}
	@PutMapping
	public String showPUTMSG(){
	return "Spring boot put";
	}
	
	@DeleteMapping
	public String showDeleteMsg()
	{
		return "Spring boot delet";
	}

}

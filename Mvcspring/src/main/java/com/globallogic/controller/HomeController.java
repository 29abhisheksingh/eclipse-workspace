package com.globallogic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(path = "/gethome", method = RequestMethod.GET)
	public String getHome() {
		System.out.println("hello home");

		return "home";

	}

	@RequestMapping(path = "/posthome", method = RequestMethod.POST)
	public String postHome(@RequestParam("username")String Username, 
			               @RequestParam("password")String Password, Model m)
	{
		System.out.println("Username "+Username);
		System.out.println("Password "+Password);
		
		m.addAttribute("Name", Username);
		m.addAttribute("Password", Password);
		return "Success";
	
	}
	

}


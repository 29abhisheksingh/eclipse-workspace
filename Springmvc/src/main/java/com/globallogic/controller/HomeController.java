package com.globallogic.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.MyConnection;
@Controller
@RequestMapping("/home")
public class HomeController {

	
	@RequestMapping(method = RequestMethod.GET, path = "/getrequest")
	public ModelAndView getMessage(@RequestParam Map<String,String> map) throws Exception
	{
		Connection conn=null;
		//connection 
		 MyConnection connection =  new MyConnection();
		 conn= connection.getConnection();
		//connection
		 Statement st=conn.createStatement();
		 
		
		
		map.forEach((k,v)->System.out.println("key "+k +" value "+v));
		System.out.println("hello Controller get");
		ModelAndView modelAndView=new ModelAndView("/home");
		String name="ravinder";
		modelAndView.addObject("name",name);
		modelAndView.addObject("age","35");
		modelAndView.addObject("salary",1000);
		System.out.println("?");
		return modelAndView;
	}
	
	
	/*@RequestMapping(path = "/gethome", method = RequestMethod.GET)
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
	
	}*/
	

}
package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.enities.Client;
import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;
import com.cg.service.IComplaintService;


import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/complaint")
public class ComplaintController{
	

	@Autowired
	private IComplaintService cs;
	
	@GetMapping("/complaint/")
	public List<Complaint> getClientAllComplaints(@RequestBody Client client){
		return cs.getClientAllComplaints(client);
	}
	
	@GetMapping("/complaint/")

	public List<Complaint> getClientAllOpenComplaints(@RequestBody Client client){
	return cs.getClientAllComplaints(client);
}
	@GetMapping("/complaint/")
	public Engineer getEngineer(@PathVariable int id) {
		return cs.getEngineer(id);
	}
	@GetMapping("/complaint/")

	public Product getProductComplaint(@PathVariable int id) {
		return cs.getProductByComplaint(id);
	}
	
}
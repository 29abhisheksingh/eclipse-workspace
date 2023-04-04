package com.cg.controller;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;
import com.cg.service.IAdminService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AdminController {
	
	@Autowired
	private IAdminService ids;
	
	@PostMapping("/admin/addengineer")
	public void addEngineer(@RequestBody Engineer engineer)
	{
		ids.addEngineer(engineer);
	}
	
	
	
	@GetMapping("/admin/getcomplaints")
	public List<Complaint> getAllComplaints(@RequestBody Complaint complaint)
	{
		return ids.getComplaints(complaint.getComplainName());
	}
	
	
	
	
	@GetMapping("/admin/getcomplaintsproduct")
	public List<Complaint> getAllComplaintsByProduct(@RequestBody Product product)
	{
		return ids.getComplaintsByProduct(product.getProductName());
	}
	
	
	
	@PutMapping("admin/replaceengineer")
	public void replaceAEngineer(@RequestBody Engineer engineer)
	{
		ids.replaceEngineerFromComaplaint(engineer.getEngineerName(),engineer.getEmployeeId());
	}
	
	
	
	@PutMapping("admin/changedomain")
	public void changeADomain(@RequestBody Engineer engineer)
	{
		ids.changeDomain(engineer.getEmployeeId(),engineer.getDomain());
	}
	
	
	@DeleteMapping("admin/deleteengineer")
	public void DeleteEngineer(@RequestHeader int employeeId)
	{
	ids.removeEngineer(employeeId);
	}

	

}*/
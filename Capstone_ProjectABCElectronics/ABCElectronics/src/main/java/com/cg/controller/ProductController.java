package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;
import com.cg.service.IProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/product")
public class ProductController {


	@Autowired
	private IProductService pro_ser;
	
	//add product
	@PostMapping("/product/addProduct")
	public void addProduct(@RequestBody Product product) {
		pro_ser.addProduct(product);
		
	}
	
	//remove product
	@DeleteMapping("/product/removeProduct")
	public void removeProducts(String product) {
		pro_ser.removeProducts(product);
	}

	//get product
	@GetMapping("/")
	public List<Product> getProduct(String product) {
		return pro_ser.getProduct(product);
		
	}
	
	//update product warranty
//	@PutMapping("/product/updProductWar")
	public void updateProductWarranty(String product) {
		
	}
//	updateProductWarranty
	
	
	//get product complaint
	@GetMapping("/")
	public List<Complaint> getProductComplaints(String complain){
		return pro_ser.getProductComplaints(complain);
		
	}
	
	
	//get engineer by product
	@GetMapping("/")
	public List<Engineer> getEngineersByProduct(String product){
		return pro_ser.getEngineersByProduct(product);
	}
	
	
}
package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;
@Service
public interface IProductService
{
	void addProduct(Product product);
	
	void removeProducts(int product);
	
	Product getProduct(int product);
	
	//void updateProductWarranty(int product);
	
	List<Complaint> getProductComplaints(int product);
	
	//List<Engineer> getEngineersByProduct(int product);
}

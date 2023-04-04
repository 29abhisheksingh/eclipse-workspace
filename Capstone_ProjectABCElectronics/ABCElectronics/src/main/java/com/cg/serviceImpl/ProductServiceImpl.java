package com.cg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;
import com.cg.repository.IProductRepsoitory;
import com.cg.service.IProductService;

public class ProductServiceImpl implements IProductService
{
	@Autowired
	IProductRepsoitory proRepo;
	
	@Override
	public void addProduct(Product product)
	{
		this.proRepo.addProduct(product);
		
	}

	@Override
	public void removeProducts(String product) 
	{
		this.proRepo.removeProduct(product);
		
	}

	@Override
	public List<Product> getProduct(String product) 
	{
		List<Product> li=this.proRepo.getProdcut(product);
		return li;
	}

	@Override
	public void updateProductWarranty(String product) 
	{

		this.proRepo.updateProductWarranty(product);
	}

	@Override
	public List<Complaint> getProductComplaints(String product) 
	{
		List<Complaint> li=this.proRepo.getProdcutComplaints(product);
		return li;
	}

	@Override
	public List<Engineer> getEngineersByProduct(String product) 
	{
		List<Engineer> li=this.proRepo.geEngineersByProduct(product);
		return li;
	}

}

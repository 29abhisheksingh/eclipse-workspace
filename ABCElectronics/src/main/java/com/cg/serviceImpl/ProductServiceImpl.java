package com.cg.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;
import com.cg.repository.IComplaintRepository;
import com.cg.repository.IProductRepsoitory;
import com.cg.service.IProductService;

public class ProductServiceImpl implements IProductService {
	@Autowired
	IProductRepsoitory proRepo;
	
	@Autowired
	IComplaintRepository icr;

	@Override
	public void addProduct(Product product) {
		proRepo.save(product);

	}

	@Override
	public void removeProducts(int product) {
		proRepo.deleteById(product);

	}

	@Override
	public Product getProduct(int product) {
		Optional<Product> li = proRepo.findById(product);
		return li.get();
	}

//	@Override
//	public void updateProductWarranty(int product) {   // logic for updation
//
//		proRepo.updateProductWarranty(product);
//	}

	@Override
	public List<Complaint> getProductComplaints(int product) {
		List<Complaint> li = icr.findAllByProdctModelNumber(product);
		return li;
	}

//	@Override
//	public List<Engineer> getEngineersByProduct(String product) {
//		List<Engineer> li = proRepo.geEngineersByProduct(product);  // db update no mapping
//		return li;
//	}

}

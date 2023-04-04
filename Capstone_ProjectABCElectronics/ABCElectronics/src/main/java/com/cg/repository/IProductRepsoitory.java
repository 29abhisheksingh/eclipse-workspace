package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;

@Repository

public interface IProductRepsoitory extends JpaRepository<Product,String>
{
	void addProduct(Product product);
	void removeProduct(String product);
	List<Product> getProdcut(String product);
	void updateProductWarranty(String pro);
	List<Complaint> getProdcutComplaints(String complain);
	List<Engineer> geEngineersByProduct(String pro);
}

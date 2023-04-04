package com.example.demo.ServiceImpl;

import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;
import com.example.demo.Repository.IComplaintRepository;
import com.example.demo.Repository.IEngineerRepository;
import com.example.demo.Repository.IProductRepsoitory;
import com.example.demo.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepsoitory productRepsoitory;
    @Autowired
    IComplaintRepository complaintRepository;
    @Autowired
    IEngineerRepository engineerRepository;


    @Override
    public void addProduct(Product product) {
        productRepsoitory.save(product);
    }

    @Override
    public void removeProduct(Integer productId) {
        productRepsoitory.deleteById(productId);
    }

    @Override
    public Product getProduct(Integer productId) {
        return productRepsoitory.findById(productId).get();
    }

    @Override
    public void updateProductWarrenty(Integer productId , int years) {
    	Optional<Product> product = productRepsoitory.findById(productId);
    	if(product.isPresent()){
    		product.get().setWarrantyYears(years);
    		productRepsoitory.save(product.get());
    	}
    }

    @Override
    public List<Complaint> getProductComplaints(Integer productId) {
        Optional<Product> product = productRepsoitory.findById(productId);
        if(product.isPresent()){
            return product.get().getComplaint();
        }
        return null;
    }

    @Override
    public List<Engineer> getEngineersByProduct(Integer productId) {
        //Todo:: No Direct mapping found between Engineer and Product.
        return null;
    }
}

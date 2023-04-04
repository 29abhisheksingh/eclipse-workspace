package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;
import com.example.demo.Service.IProductService;

import java.util.List;


//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private IProductService pro;

    //add product
    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product) {
        pro.addProduct(product);
    }

    //remove product
    @DeleteMapping("/removeProduct/{productId}")
    public void removeProduct(@RequestParam("productId") Integer productId) {
        pro.removeProduct(productId);
     }
    //get product
    @GetMapping("/getProduct/{productId}")
    public Product getProduct(@RequestParam("productId")Integer productId) {
        return pro.getProduct(productId);

    }

    //update product warranty
	@PutMapping("/updProductWar/{productId}/{years}")
    public void updateProductWarrenty(@RequestParam("productId")Integer productId,@RequestParam("years") int years) {
		  pro.updateProductWarrenty(productId, years);
	}

    //get product complaint
    @GetMapping("/getprodComp/{productId}")
    public List<Complaint> getProductComplaints(@RequestParam("productId")Integer productId) {
        return pro.getProductComplaints(productId);

    }


    //get engineer by product
    @GetMapping("/getEngbyProd/{productId}")
    public List<Engineer> getEngineersByProduct(@RequestParam("productId")Integer productId) {
        return pro.getEngineersByProduct(productId);
    }


}
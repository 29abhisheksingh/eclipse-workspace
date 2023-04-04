package com.cg.enities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Product
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int modelNumber;
	
	@Column
	private String productName;
	
	@Column
	private String productCategoryName;
	
	@Column
	private LocalDate datedPurchase;
	
	@Column
	private int warrantyYears;
	
	@Column
	private LocalDate warrantyDate;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int modelNumber, String productName, String productCategoryName, LocalDate datedPurchase,
			int warrantyYears, LocalDate warrantyDate) {
		super();
		this.modelNumber = modelNumber;
		this.productName = productName;
		this.productCategoryName = productCategoryName;
		this.datedPurchase = datedPurchase;
		this.warrantyYears = warrantyYears;
		this.warrantyDate = warrantyDate;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public LocalDate getDatedPurchase() {
		return datedPurchase;
	}

	public void setDatedPurchase(LocalDate datedPurchase) {
		this.datedPurchase = datedPurchase;
	}

	public int getWarrantyYears() {
		return warrantyYears;
	}

	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}

	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
	
	
}

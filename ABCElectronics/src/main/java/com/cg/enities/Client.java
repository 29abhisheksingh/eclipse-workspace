package com.cg.enities;

import java.util.List;

import javax.persistence.*;

@Entity
public class Client
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int clientId;
	
	@Column
	private String password;
	
	@Column
	private String address;
	
	@Column
	private long phoneNumber;
	
	
	
	@OneToMany(targetEntity=Product.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="client_product",referencedColumnName="clientId")
	private List<Product> product;


	@OneToMany(targetEntity=Complaint.class,cascade=CascadeType.ALL)
	@JoinColumn(name="client_complaint",referencedColumnName="clientId")
	private List<Complaint> complaint;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Client(int clientId, String password, String address, long phoneNumber, List<Product> product,
			List<Complaint> complaint) {
		super();
		this.clientId = clientId;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.product = product;
		this.complaint = complaint;
	}


	public int getClientId() {
		return clientId;
	}


	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	public List<Complaint> getComplaint() {
		return complaint;
	}


	public void setComplaint(List<Complaint> complaint) {
		this.complaint = complaint;
	}


	
}

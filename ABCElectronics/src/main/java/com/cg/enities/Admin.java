package com.cg.enities;

import java.util.List;

import javax.persistence.*;

@Entity

public class Admin
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adminId;
	
	@Column
	private String password;
	
	@Column
	private long contactNumber;
	
	@Column
	private String emailid;
	
	/*@OneToMany(targetEntity=Client.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="admin_client",referencedColumnName="adminId")
	private List<Client> client;
	
	@OneToMany(targetEntity=Complaint.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="admin_Complain",referencedColumnName="adminId")
	private List<Complaint> complaint;
	
	
	
	@OneToMany(targetEntity=Product.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="admin_product",referencedColumnName="adminId")
	private List<Product> product;*/
	
	@OneToMany(targetEntity=Engineer.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="admin_engine",referencedColumnName="adminId")
	private List<Engineer> engineer;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminId, String password, long contactNumber, String emailid, List<Client> client,
			List<Complaint> complaint, List<Engineer> engineer, List<Product> product) {
		super();
		this.adminId = adminId;
		this.password = password;
		this.contactNumber = contactNumber;
		this.emailid = emailid;
	//	this.client = client;
	//	this.complaint = complaint;
		this.engineer = engineer;
	//	this.product = product;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
/*	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}

	public List<Complaint> getComplaint() {
		return complaint;
	}

	public void setComplaint(List<Complaint> complaint) {
		this.complaint = complaint;
	}*/

	public List<Engineer> getEngineer() {
		return engineer;
	}

	public void setEngineer(List<Engineer> engineer) {
		this.engineer = engineer;
	}

/*	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}*/
	
}

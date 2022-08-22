package com.globalogic.Bookstore.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="signup")
public class Signup {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String email;
	
	@Column
	String password;

	@OneToMany
	List<Bookstore> b2;


	public Signup(int id, String email, String password, List<Bookstore> b2) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.b2 = b2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public List<Bookstore> getB2() {
		return b2;
	}

	public void setB2(List<Bookstore> b2) {
		this.b2 = b2;
	}

	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

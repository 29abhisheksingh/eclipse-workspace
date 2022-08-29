package com.globallogic.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="signup")
public class Signup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Column
	String email;

	@Column
	String pass;

	public Signup(long id, String email, String pass) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
	}

	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Signup [id=" + id + ", email=" + email + ", pass=" + pass + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
	
}

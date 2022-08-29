package com.globallogic.book.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Column
	String name;

	@Column
	long phone;

	@Column
	String address;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	Signup s;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	List<Book> b;

	public Admin(long id, String name, long phone, String address, Signup s, List<Book> b) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.s = s;
		this.b = b;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Signup getS() {
		return s;
	}

	public void setS(Signup s) {
		this.s = s;
	}

	public List<Book> getB() {
		return b;
	}

	public void setB(List<Book> b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", s=" + s + ", b="
				+ b + "]";
	}
	
	
}

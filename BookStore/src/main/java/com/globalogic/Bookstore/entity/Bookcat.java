package com.globalogic.Bookstore.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bookcat")
public class Bookcat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String bookcat;

	public Bookcat(int id, String bookcat) {
		super();
		this.id = id;
		this.bookcat = bookcat;
	}

	@Override
	public String toString() {
		return "Bookcat [id=" + id + ", bookcat=" + bookcat + "]";
	}

	public Bookcat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookcat() {
		return bookcat;
	}

	public void setBookcat(String bookcat) {
		this.bookcat = bookcat;
	}
	
	

}

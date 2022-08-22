package com.globallogic.Online.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="book")
public class BookEntity {
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", stock=" + stock + ", createdOn=" + createdOn + ", author=" + author + ", genre=" + genre + "]";
	}
	public BookEntity(long id, String name, String description, double price, int stock, Date createdOn, String author, Genre genre) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.author= author;
		this.genre=genre;
		this.price = price;
		this.stock = stock;
		this.createdOn = createdOn;
		
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	String name;
	String description;
	String author;
	Genre genre;
	
	@Column
	double price;
	@Column
	int stock;
	@Column
	Date createdOn;

}

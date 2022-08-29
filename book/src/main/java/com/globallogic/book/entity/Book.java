package com.globallogic.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Column
	String title;

	@Column
	String author;

	@Column
	String subject;
	
	@Column
	double price;

	public Book(long id, String title, String author, String subject, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.subject = subject;
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", subject=" + subject + ", price="
				+ price + "]";
	}
	
	
}

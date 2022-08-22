package com.globalogic.Bookstore.entity;




import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Bookstore {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String title;
	
	@Column
	String author;
	
	@Column
	String subject;
	
	@ManyToOne
	List<Bookcat> book;

	public Bookstore(int id, String title, String author, String subject, List<Bookcat> book) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.subject = subject;
		this.book = book;
	}

	@Override
	public String toString() {
		return "Bookstore [id=" + id + ", title=" + title + ", author=" + author + ", subject=" + subject + ", book="
				+ book + "]";
	}

	public Bookstore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

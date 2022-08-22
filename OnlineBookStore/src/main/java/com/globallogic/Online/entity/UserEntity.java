package com.globallogic.Online.entity;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {
	
	public List<BookEntity> getOrderedBook() {
		return orderedBook;
	}
	public void setOrderedBook(List<BookEntity> orderedBook) {
		this.orderedBook = orderedBook;
	}
	public UserEntity(long id, String name, String email, String password,List<BookEntity> orderedBook) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.orderedBook = orderedBook;
	}
	public UserEntity() {
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
	@Override
	public String toString() {
		return "AdminEntity [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", orderedBook=" + orderedBook + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@Column
	String name;
	@Column
	String email;
	@Column
	String password;
	@JoinColumn(name="ordered_book_id", nullable=false)
	@ManyToMany
	List<BookEntity> orderedBook;
	
	
	

}



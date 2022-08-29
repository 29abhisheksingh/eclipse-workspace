package com.globallogic.Portal.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="student")
public class StudentEntity {

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEntity(long id, String name, List<ExamEntity> subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", subject=" + subject + " ]";
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
	public List<ExamEntity> getSubject() {
		return subject;
	}
	public void setSubject(List<ExamEntity> subject) {
		this.subject = subject;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@Column
	String name;
	@OneToMany(cascade=CascadeType.PERSIST)
	List<ExamEntity> subject;
	
	
}
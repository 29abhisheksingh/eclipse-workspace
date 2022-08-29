package com.globallogic.Portal.entity;

import javax.persistence.*;

@Entity
@Table(name="staff")
public class StaffEntity {
	public StaffEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffEntity(long id, String subStaff, String questions) {
		super();
		this.id = id;
		this.subStaff = subStaff;
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "StaffEntity [id=" + id + ", subStaff=" + subStaff + ", questions=" + questions + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSubStaff() {
		return subStaff;
	}
	public void setSubStaff(String subStaff) {
		this.subStaff = subStaff;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@Column
	String subStaff;
	@Column
	String questions;
	
	
	

}

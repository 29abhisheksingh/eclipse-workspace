package com.globallogic.Portal.entity;


import javax.persistence.*;

@Entity
@Table(name="admin")
public class AdminEntity {
	public AdminEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminEntity(long id, StudentEntity student, ResultEntity res, StaffEntity staff,
			String performance) {
		super();
		this.id = id;
		this.student = student;
		this.staff = staff;
		this.res=res;
		this.performance=performance;
	}
	
	@Override
	public String toString() {
		return "AdminEntity [id=" + id + ", student=" + student + ", staff=" + staff + ", res=" + res
				+ ", performance=" + performance + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public StudentEntity getStudent() {
		return student;
	}
	public void setStudentAdmission(StudentEntity student) {
		this.student = student;
	}
	public ResultEntity getRes() {
		return res;
	}
	public void setRes(ResultEntity res) {
		this.res = res;
	}
	public StaffEntity getStaff() {
		return staff;
	}
	public void setStaff(StaffEntity staff) {
		this.staff = staff;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@OneToOne(cascade=CascadeType.PERSIST)
	StudentEntity student;
	@OneToOne(cascade=CascadeType.PERSIST)
	StaffEntity staff;
	@OneToOne(cascade=CascadeType.PERSIST)
	ResultEntity res;
	@Column
	String performance;
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	
	
}

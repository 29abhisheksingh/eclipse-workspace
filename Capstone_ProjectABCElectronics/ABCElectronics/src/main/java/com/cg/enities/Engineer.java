package com.cg.enities;

import java.util.List;

import javax.persistence.*;

@Entity

public class Engineer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	
	@Column
	private String password;
	
	@Column
	private String engineerName;
	
	@Column
	private String domain;
	
	@OneToMany(targetEntity=Complaint.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="engineerId",referencedColumnName="employeeId")
	private List<Complaint> complaint;

	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engineer(int employeeId, String password, String engineerName, String domain, List<Complaint> complaint) {
		super();
		this.employeeId = employeeId;
		this.password = password;
		this.engineerName = engineerName;
		this.domain = domain;
		this.complaint = complaint;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public List<Complaint> getComplaint() {
		return complaint;
	}

	public void setComplaint(List<Complaint> complaint) {
		this.complaint = complaint;
	}
	
}

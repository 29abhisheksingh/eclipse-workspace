package com.cg.enities;

import java.time.LocalDate;
import javax.persistence.*;


@Entity
public class Complaint
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int complaintId;
	
	@Column
	private String prodctModelNumber;
	
	
	@Column
	private String complainName;
	
	
	@Column
	private String statusw;
	

	@Column
	private int engineerId;
	
	
	@Column
	private String statusByEng;

	@Column
	private LocalDate date;
	
	
	
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Complaint(int complaintId, String prodctModelNumber, String complainName, String statusw, int engineerId,
			String statusByEng, LocalDate date) {
		super();
		this.complaintId = complaintId;
		this.prodctModelNumber = prodctModelNumber;
		this.complainName = complainName;
		this.statusw = statusw;
		this.engineerId = engineerId;
		this.statusByEng = statusByEng;
		this.date = date;
		
	}



	public int getComplaintId() {
		return complaintId;
	}



	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}



	public String getProdctModelNumber() {
		return prodctModelNumber;
	}



	public void setProdctModelNumber(String prodctModelNumber) {
		this.prodctModelNumber = prodctModelNumber;
	}



	public String getComplainName() {
		return complainName;
	}



	public void setComplainName(String complainName) {
		this.complainName = complainName;
	}



	public String getStatusw() {
		return statusw;
	}



	public void setStatusw(String statusw) {
		this.statusw = statusw;
	}



	public int getEngineerId() {
		return engineerId;
	}



	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}



	public String getStatusByEng() {
		return statusByEng;
	}



	public void setStatusByEng(String statusByEng) {
		this.statusByEng = statusByEng;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}

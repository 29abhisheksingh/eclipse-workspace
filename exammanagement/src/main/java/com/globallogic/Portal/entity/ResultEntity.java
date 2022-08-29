package com.globallogic.Portal.entity;



import javax.persistence.*;

@Entity
@Table(name="result")
public class ResultEntity {
	public ResultEntity(long id, String studentName, String subject, int totalMarks, double marksGained,
			double percentage) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.subject = subject;
		this.totalMarks = totalMarks;
		this.marksGained = marksGained;
		this.percentage = percentage;
	}

	public ResultEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public double getMarksGained() {
		return marksGained;
	}
	public void setMarksGained(double marksGained) {
		this.marksGained = marksGained;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Column
	String studentName;
	@Column
	String subject;
	@Column
	int totalMarks;
	@Column
	double marksGained;
	@Column
	double percentage;
	@Override
	public String toString() {
		return "ResultEntity [id=" + id + ", studentName=" + studentName + ", subject=" + subject + ", totalMarks="
				+ totalMarks + ", marksGained=" + marksGained + ", percentage=" + percentage + "]";
	}

	
}

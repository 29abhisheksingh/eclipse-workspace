package com.globallogic.Portal.entity;


import javax.persistence.*;

@Entity
@Table(name="exam")
public class ExamEntity {
	public ExamEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExamEntity(long id, String course, String stream, String subject, int numberOfQues, float hours,
			String status) {
		super();
		this.id = id;
		this.course = course;
		this.stream = stream;
		this.subject = subject;
		this.numberOfQues = numberOfQues;
		this.hours = hours;
		this.status = status;
	}
	@Override
	public String toString() {
		return "ExamEntity [id=" + id + ", course=" + course + ", stream=" + stream + ", subject=" + subject
				+ ", numberOfQues=" + numberOfQues + ", hours=" + hours + ", status=" + status + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getNumberOfQues() {
		return numberOfQues;
	}
	public void setNumberOfQues(int numberOfQues) {
		this.numberOfQues = numberOfQues;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.hours = hours;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@Column
	String course;
	@Column
	String stream;
	@Column
	String subject;
	@Column
	int numberOfQues;
	@Column
	float hours;
	@Column
	String status;
	
	

}

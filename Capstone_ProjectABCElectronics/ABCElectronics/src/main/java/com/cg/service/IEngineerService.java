package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;

@Service
public interface IEngineerService 
{
	List<Complaint> getAllOpenComplaints(Engineer engineer);
	
	List<Complaint> getResolvedComplaints(Engineer engineer);
	
	List<Complaint> getResolvedComplaintsByDate(Engineer engineer, LocalDate date);
	
	List<Complaint> getComplaints(Engineer engineer);
	
	String changeComplaintStatus(int id, String s);
}

package com.cg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.repository.IAdminRepository;
import com.cg.repository.IComplaintRepository;
import com.cg.repository.IEngineerRepository;
import com.cg.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService
{
	@Autowired
	IEngineerRepository engineerRepo;
	
	@Autowired
	IAdminRepository adRepo;
	
	@Autowired
	IComplaintRepository comRepo;

	@Override
	public void addEngineer(Engineer engineer) 
	{
		this.engineerRepo.save(engineer);
		
	}

	@Override
	public void changeDomain(int id, String domain) 
	{
		@SuppressWarnings("deprecation")
		Engineer e = engineerRepo.getById(id);
		e.setDomain(domain);
		
	}

	@Override
	public void removeEngineer(int engineerId) 
	{
		engineerRepo.deleteById(engineerId);
		
	}

	@Override
	public List<Complaint> getComplaintsByProduct(String product) 
	{
		List<Complaint> li=this.getComplaintsByProduct(product);
		return li;
	}

	@Override
	public List<Complaint> getComplaints(String complain) 
	{
		List<Complaint> li=this.comRepo.findAll();
		return li;
	}

	@Override
	public Complaint replaceEngineerFromComaplaint(String name, int id) {
		
		@SuppressWarnings("deprecation")
		Complaint c = comRepo.getById(id);
		int engid = c.getEngineerId();
		@SuppressWarnings("deprecation")
		Engineer e = engineerRepo.getById(engid);
		e.setEngineerName(name);
		return null;
	}

	

}
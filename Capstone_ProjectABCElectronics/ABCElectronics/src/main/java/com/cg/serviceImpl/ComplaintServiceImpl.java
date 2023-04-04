package com.cg.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.enities.Client;
import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;
import com.cg.repository.IComplaintRepository;
import com.cg.service.IComplaintService;
@Service
public class ComplaintServiceImpl implements IComplaintService
{

	@Autowired
	IComplaintRepository comRepo;
	
	@Override
	public boolean bookComplaint(Client client, Complaint complaint, Product product) 
	{
		
		return this.comRepo.bookComplaint(client, complaint, product); 
	}

	@Override
	public String changeComplaintStatus(Complaint complaint) 
	{
		String str=this.comRepo.changeComplaintStatus(complaint);
		return str;
	}

	@Override
	public List<Complaint> getClientAllComplaints(Client client) 
	{
		List<Complaint> li=this.comRepo.getClientAllComplaints(client);
		return li;
	}

	@Override
	public List<Complaint> getClientAllOpenComplaints(Client client) 
	{
		List<Complaint> li=this.comRepo.getClientAllOpenComplaints(client);
		return li;
	}

	@Override
	public Engineer getEngineer(int id) 
	{
		Engineer eng=this.getEngineer(id);
		return eng;
	}

	@Override
	public Product getProductByComplaint(int id) 
	{
		Product pro=this.comRepo.getProductByComplaint(id);
		return pro;
	}

}

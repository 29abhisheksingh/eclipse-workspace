package com.cg.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.enities.Client;
import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;
import com.cg.repository.IComplaintRepository;
import com.cg.repository.IEngineerRepository;
import com.cg.repository.IProductRepsoitory;
import com.cg.service.IComplaintService;
@Service
public class ComplaintServiceImpl implements IComplaintService
{

	@Autowired
	IComplaintRepository comRepo;
	
	@Autowired
	IProductRepsoitory ipr;
	
	@Autowired
	IEngineerRepository ier;
	
	
	@Override
	public boolean bookComplaint(Complaint complaint, Product product) 
	{
		
		complaint.setComplainName(complaint.getComplainName());
		complaint.setProdctModelNumber(product.getModelNumber());
		comRepo.save(complaint);
		return true;
		

	}

	@Override
	public String changeComplaintStatus(Complaint complaint) 
	{
		Complaint str=comRepo.save(complaint);
		return str.getStatusByEng();
	}

	@Override
	public List<Complaint> getClientAllComplaints(Client client) 
	{
		List<Complaint> li=comRepo.findAllByClientId(client.getClientId());
		return li;
	}

	@Override
	public List<Complaint> getClientAllOpenComplaints(Client client) 
	{
		List<Complaint> li=comRepo.findAllByClientIdAndStatusw(client.getClientId(),"open");
		return li;
	}

	@Override
	public Engineer getEngineer(int id) 
	{
		Optional<Engineer> eng=ier.findById(id);
		return eng.get();
	}

	@Override
	public Product getProductByComplaint(int id) 
	{
		Optional<Complaint> pro=comRepo.findById(id);
		if(pro.isPresent())
		{
			Product prod = ipr.findByModelNumber(pro.get().getProdctModelNumber());
			return prod;
		}
		return null;
	}

}

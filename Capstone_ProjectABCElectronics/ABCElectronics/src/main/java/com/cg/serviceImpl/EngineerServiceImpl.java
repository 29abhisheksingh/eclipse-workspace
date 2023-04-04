package com.cg.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.repository.IComplaintRepository;
import com.cg.repository.IEngineerRepository;
import com.cg.service.IEngineerService;

@Service
public class EngineerServiceImpl implements IEngineerService
{
	
	@Autowired
	IEngineerRepository engineRepo;
	
	@Autowired
	IComplaintRepository comRepo;
	
	
	//All the complaints that are currently open at Client end//
	
	@Override
	public List<Complaint> getAllOpenComplaints(Engineer engineer) 
	{
		
		List<Engineer> eng = engineRepo.findAll();
		List<Complaint> comp = comRepo.findAll();

		ArrayList<Complaint> li1 = new ArrayList<Complaint>();
		
		eng.forEach(e -> {
			if (e == engineer) {
				comp.forEach(c -> {
					if(e.getEmployeeId()==c.getEngineerId())
					{
					if (c.getStatusw() == null) {
						li1.add(c);
					}
					}
				});
			}
		});

		return li1;
	}
	
	

	
	//All the complaint that are closed at Client end//
	
	@Override
	public List<Complaint> getResolvedComplaints(Engineer engineer)
	{
		
		List<Engineer> eng = engineRepo.findAll();
		List<Complaint> comp = comRepo.findAll();

		ArrayList<Complaint> li2 = new ArrayList<Complaint>();
		
		
		eng.forEach(e -> {
			if (e == engineer) {
				comp.forEach(c -> {
					if(e.getEmployeeId()==c.getEngineerId())
					{
					if (c.getStatusw().equals("closed")) {
						li2.add(c);
					}
					}
				});
			}
		});

		return li2;
	}
	
	

	
	//All the complaint sorted by date that has been resolved by Engineer//
	
	@Override
	public List<Complaint> getResolvedComplaintsByDate(Engineer engineer, LocalDate date) 
	{
		
		List<Complaint> comp = comRepo.findAll();
		List<Engineer> eng = engineRepo.findAll();
		
		ArrayList<Complaint> li3 = new ArrayList<Complaint>();
		
		
		Collections.sort(comp,(a,b)->a.getDate().compareTo(b.getDate()));
		eng.forEach(e -> 
		{
			if(e == engineer)
			{
			comp.forEach(c -> {	
				if(e.getEmployeeId()==c.getEngineerId())
				{
				li3.add(c);
				}
				});
				}
		
		});
		
		return li3;
	}
	
	

	//All the open and closed complaints that has been assigned to engineer//
	
	@Override
	public List<Complaint> getComplaints(Engineer engineer)
	{
		
		List<Engineer> eng = engineRepo.findAll();
		List<Complaint> comp = comRepo.findAll();

		ArrayList<Complaint> li4 = new ArrayList<Complaint>();

		eng.forEach(e -> {
			if (e == engineer) {
				comp.forEach(c -> {
					if(e.getEmployeeId()==c.getEngineerId())
					{
					li4.add(c);
					}
				});
			}
		});

		return li4;
	}
	
	
	

	
	//Changing status of the complaint resolved or not at the Engineer end by Engineer//
	
	@SuppressWarnings("deprecation")
	@Override
	public String changeComplaintStatus(int id, String s) 
	{
		
		Complaint c = comRepo.getById(id);
		
		c.setStatusByEng(s);
		
		return c.getStatusByEng();
	}

}

package com.cg.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.repository.IAdminRepository;
import com.cg.repository.IComplaintRepository;
import com.cg.repository.IEngineerRepository;
import com.cg.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	IEngineerRepository engineerRepo;

	@Autowired
	IAdminRepository adRepo;

	@Autowired
	IComplaintRepository comRepo;

	@Override
	public void addEngineer(Engineer engineer) {
		this.engineerRepo.save(engineer);

	}

	@Override
	public void changeDomain(int id, String domain) {

		Optional<Engineer> e = engineerRepo.findById(id);
		e.get().setDomain(domain);
		engineerRepo.save(e.get());

	}

	@Override
	public void removeEngineer(int engineerId) {
		engineerRepo.deleteById(engineerId);

	}

	@Override
	public List<Complaint> getComplaintsByProduct(int productId) {
		List<Complaint> li = comRepo.findAllByProdctModelNumber(productId);
		return li;
	}

	@Override
	public List<Complaint> getComplaints(String complain) {
		List<Complaint> li = comRepo.findAll();
		return li;
	}

	@Override
	public Complaint replaceEngineerFromComaplaint(String name, int id) {

		Optional<Complaint> c = comRepo.findById(id);
		int engid = c.get().getEngineerId();
		Optional<Engineer> e = engineerRepo.findById(engid);
		e.get().setEngineerName(name);
		engineerRepo.save(e.get());
		return null;
	}

}
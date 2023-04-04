package com.cg.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.enities.Client;
import com.cg.enities.Engineer;
import com.cg.repository.IClientRepository;
import com.cg.repository.IComplaintRepository;
import com.cg.repository.IEngineerRepository;
import com.cg.service.IClientService;
@Service
public class ClientServiceImpl implements IClientService 
{

	@Autowired
	IClientRepository clientRepo;
	
	@Autowired
	IEngineerRepository ier;
	
	@Autowired
	IComplaintRepository icr;
	
	@Override
	public void saveClient(Client client)
	{
	 clientRepo.save(client);
		
	}

	@Override
	public Client getClientByCLientId(int clientId) 
	{
		Optional<Client> clin=clientRepo.findById(clientId);
		return clin.get();
	}

	@Override
	public Engineer getEngineerById(int employeeId) 
	{
		Optional<Engineer> engin=ier.findById(employeeId);
		return engin.get();
	}

	@Override
	public List<Engineer> getEngineersByDomain(String domain) 
	{
		List<Engineer> li=ier.findByDomain(domain);
		return li;
	}

//	@Override
//	public String changeStatusOfComplaint(int status)  //not usable give identifier
//	{
//		String str=icr.(status);
//		return str;
//	}

//	@Override
//	public Client signIn(Client signClient) 
//	{
//		Client clin=this.clientRepo.signIn(signClient);
//		return clin;
//	}
//
//	@Override
//	public Client signOut(Client signClient) 
//	{
//		Client clin=this.clientRepo.signOut(signClient);
//		return clin;
//	}

}

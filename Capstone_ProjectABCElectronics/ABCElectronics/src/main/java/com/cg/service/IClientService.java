package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.enities.Client;
import com.cg.enities.Engineer;
@Service
public interface IClientService
{
	void saveClient(Client client);
	
	Client getClientByCLientId(int clientId);
	
	Engineer getEngineerById(int employeeId);
	
	List<Engineer> getEngineersByDomain(String domain);
	
	String changeStatusOfComplaint(int status);
	
	String signIn(int id, String password);
	
	Client signOut(Client signClient);

	

	
	
}

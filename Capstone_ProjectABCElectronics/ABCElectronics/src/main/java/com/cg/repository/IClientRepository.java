package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.enities.Client;
import com.cg.enities.Engineer;
@Repository
public interface IClientRepository extends JpaRepository<Client,Integer>
{
	void saveClient(Client clint);
	Client getClientByCLientId(int clientId);
	Engineer getEngineerById(int engineerId);
	List<Engineer> getEngineerByDomain(String domain);
	String changeStatusOfCompaint(int status);
	List<Client> signIn(int id, String passw);
	Client signOut(Client signOut);
	
	 
}

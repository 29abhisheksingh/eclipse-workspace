package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.enities.Client;
import com.cg.enities.Engineer;
@Repository
public interface IClientRepository extends JpaRepository<Client,Integer>
{
	//void saveClient(Client clint);
//	Client getClientByClientId(int clientId);
	
	//String changeStatusOfCompaint(int status);
//	Client signIn(Client sigIn);
//	Client signOut(Client signOut);
	
	 
}

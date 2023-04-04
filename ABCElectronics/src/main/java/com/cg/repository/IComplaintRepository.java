package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.enities.Client;
import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;

@Repository
public interface IComplaintRepository extends JpaRepository<Complaint,Integer>
{
	//boolean bookComplaint(Client client,Complaint complaint,Product product);

	//String changeComplaintStatus(Complaint complaint);
	List<Complaint> findAllByClientId(int clientId);
	List<Complaint> findAllByClientIdAndStatusw(int clientId,String status );
	List<Complaint> findAllByProdctModelNumber(int productId);
	//List<Complaint> getClientAllComplaints(Client client);
	//List<Complaint> getClientAllOpenComplaints(Client client);
	//Engineer getEngineer(int engineerId);
	//Product getProductByComplaint(int complaiinId);
}

package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.enities.Client;
import com.cg.enities.Engineer;
import com.cg.service.IClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	IClientService cl;
	@PostMapping("/client/saveClient")
	public void saveClient(@RequestBody Client client)
	{
		cl.saveClient(client);
	}
    @GetMapping("/client/getClientId")
    public Client getClientByCLientId(@RequestBody Client client)
    {
    	return cl.getClientByCLientId(client.getClientId());
    }
    @GetMapping("/client/getEnginnerId")
    public Engineer getEngineerById(@RequestBody int engineerId)
    {
    	return cl.getEngineerById(engineerId);
    }
    @GetMapping("/client/getEngineerDom")
    public List<Engineer> getEngineerByDomain(@RequestBody String domain)
    {
    	return cl.getEngineersByDomain(domain);
    }
 //   @PutMapping("/client/changeStatus")
//    public void changeStatusOfCompaint(@RequestBody int status)
//    {
//    	cl.changeStatusOfComplaint(status);
//    }
//    @PutMapping("/client/signIn")
//    public Client signIn(@RequestBody Client signIn)
//    {
//    	return cl.signIn(signIn);
//    }
//    @PutMapping("/client/signOut")
//    public Client signOut(@RequestBody Client signOut)
//    {
//    	return cl.signOut(signOut);
//    }

}
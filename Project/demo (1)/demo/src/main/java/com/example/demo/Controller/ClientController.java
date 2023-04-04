package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entities.Engineer;
import com.example.demo.Service.IClientService;

//import ch.qos.logback.core.net.server.Client;
import com.example.demo.Entities.Client;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    IClientService cl;

    @PostMapping("/client/saveClient")
    public void saveClient(@RequestBody Client client) {
        cl.saveClient(client);
    }

    @GetMapping("/client/getClientId")
    public Client getClientByCLientId(@RequestBody int clientId) {
    	return cl.getClientByClientId(clientId);
    }

    @GetMapping("/client/getEnginnerId")
    public Engineer getEngineerById(@RequestBody int engineerId) {
        return cl.getEngineerById(engineerId);
    }

    @GetMapping("/client/getEngineerDom")
    public List<Engineer> getEngineerByDomain(@RequestBody String domain) {
        return cl.getEngineersByDomain(domain);
    }


}
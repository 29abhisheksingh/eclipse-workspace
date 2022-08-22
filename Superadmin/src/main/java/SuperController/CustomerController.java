package SuperController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Customerentity.Customerentity;
import Customerrepo.Customerrepo;

@RestController
@RequestMapping("/Cust")
public class CustomerController {

	@Autowired
	Customerrepo repo;
	
	@PutMapping("/put1")
	public Customerentity updateCustomer(@RequestBody Customerentity ce)
	{
		System.err.println(ce);
		repo.save(ce);
		System.err.println(ce);
		return ce;
	}

	@GetMapping("/get1")
	public List<Customerentity> showEmployee()
	{
		return repo.findAll();
	}
}


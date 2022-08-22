package SuperController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Merchantentity.Merchantentity;
import Merchantrepo.Merchantrepo;


@RestController
@RequestMapping("/merch")
public class Merchantcontroller {
	
	@Autowired
	Merchantrepo repo;

	
	@PutMapping("/add")
	public  Merchantentity updateEmployee(@RequestBody Merchantentity ma)
	{
		System.err.println(ma);
		repo.save(ma);
		System.err.println(ma);
		return ma;
	}
	
	@GetMapping("/m")
	public List<Merchantentity> showEmployee()
	{
		return repo.findAll();
	}

}

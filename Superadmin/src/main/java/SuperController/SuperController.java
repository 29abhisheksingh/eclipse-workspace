package SuperController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Superadminentity.Superadminentity;
import Superadminrepo.Superadminrepo;

@RestController
@RequestMapping("/super")
public class SuperController {
	
	@Autowired
	Superadminrepo repo;
	
	@PutMapping("/add")
	public  Superadminentity updateEmployee(@RequestBody Superadminentity sa)
	{
		System.err.println(sa);
		repo.save(sa);
		System.err.println(sa);
		return sa;
	}
	
	@GetMapping("/")
	public List<Superadminentity> showEmployee()
	{
		return repo.findAll();
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Superadminentity>> findByName(String query)
	{
		return ResponseEntity.ok(repo.findByName(query));
	}

}

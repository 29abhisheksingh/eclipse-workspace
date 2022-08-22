package SuperController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Categoryentity.Categoryentity;
import Categoryrepo.Categoryrepo;


@RestController
@RequestMapping("/cat")
public class CategoryController {
	
	@Autowired
	Categoryrepo repo;
	
	@PutMapping("/put")
	public Categoryentity  updateCategory(@RequestBody Categoryentity ce)
	{
		System.err.println(ce);
		repo.save(ce);
		System.err.println(ce);
		return ce;
	}

	@GetMapping("/get")
	public List<Categoryentity> showEmployee()
	{
		return repo.findAll();
	}
}

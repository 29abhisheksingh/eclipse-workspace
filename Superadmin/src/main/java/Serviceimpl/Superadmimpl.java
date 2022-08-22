package Serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import Service.Superadminsevice;
import Superadminentity.Superadminentity;
import Superadminrepo.Superadminrepo;

@Service
public class Superadmimpl implements Superadminsevice{

	
	private Superadminrepo repo;
	@Override
	public List<Superadminentity> findByName(String query) {
		
		List<Superadminentity> superadmin = repo.findByName(query);
		
		return superadmin;
	}
	public Superadmimpl(Superadminrepo repo) {
		super();
		this.repo = repo;
	}

	

}

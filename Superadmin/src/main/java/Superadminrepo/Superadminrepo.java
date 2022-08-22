package Superadminrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Superadminentity.Superadminentity;
import java.util.List;



public interface Superadminrepo extends JpaRepository<Superadminentity, Integer>{
	
	@Query("SELECT  p from Superadminentity where"+
	"p.name LIKE('%', :query,'%')")
	
	List<Superadminentity> findByName(String query);

}

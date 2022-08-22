package Service;


import java.util.List;

import Superadminentity.Superadminentity;

public interface Superadminsevice {
	
	List<Superadminentity> findByName(String query);

}

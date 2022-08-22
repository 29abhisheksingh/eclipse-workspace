package Customerrepo;

import org.springframework.data.jpa.repository.JpaRepository;


import Customerentity.Customerentity;

public interface Customerrepo extends JpaRepository<Customerentity, Integer>{

}

package Merchantrepo;

import org.springframework.data.jpa.repository.JpaRepository;


import Merchantentity.Merchantentity;


public interface Merchantrepo extends JpaRepository<Merchantentity, Integer>{

}

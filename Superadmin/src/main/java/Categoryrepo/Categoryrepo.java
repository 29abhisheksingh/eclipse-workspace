package Categoryrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import Categoryentity.Categoryentity;


public interface Categoryrepo extends JpaRepository<Categoryentity, Integer>{

}

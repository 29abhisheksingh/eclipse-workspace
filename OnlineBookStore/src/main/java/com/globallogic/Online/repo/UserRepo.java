package com.globallogic.Online.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Online.entity.UserEntity;


public interface UserRepo extends JpaRepository<UserEntity, Long>{
	public List<UserEntity> findByName(String name);
	
	

}

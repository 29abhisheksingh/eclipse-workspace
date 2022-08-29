package com.globallogic.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.book.entity.Admin;


public interface Adminrepo extends JpaRepository<Admin , Long>{

}

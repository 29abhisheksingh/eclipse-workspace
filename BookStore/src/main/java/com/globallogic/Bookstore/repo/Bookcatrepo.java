package com.globallogic.Bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globalogic.Bookstore.entity.Bookcat;


public interface Bookcatrepo  extends JpaRepository<Bookcat, Integer> {

}

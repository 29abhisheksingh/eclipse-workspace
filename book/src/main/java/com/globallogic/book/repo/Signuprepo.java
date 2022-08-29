package com.globallogic.book.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.book.entity.Signup;

public interface Signuprepo extends JpaRepository<Signup, Long>{

}

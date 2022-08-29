package com.globallogic.Portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Portal.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity,Long>{

}

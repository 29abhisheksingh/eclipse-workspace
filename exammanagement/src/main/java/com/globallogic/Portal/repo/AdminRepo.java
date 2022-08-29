package com.globallogic.Portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Portal.entity.AdminEntity;

public interface AdminRepo extends JpaRepository<AdminEntity,Long> {

}

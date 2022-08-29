package com.globallogic.book.repo;

import com.globallogic.book.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User, Long> {

}

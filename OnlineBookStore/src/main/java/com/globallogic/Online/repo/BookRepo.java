package com.globallogic.Online.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Online.entity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Long> {
	public List<BookEntity> findByName(String name);

}

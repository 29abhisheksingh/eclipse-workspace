package com.globallogic.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.book.entity.Book;

public interface Bookrepo extends JpaRepository<Book , Long>{

}

package com.globallogic.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.globallogic.book.entity.Book;
@Component
public interface bookserv {

	
	public String addbook(Book bk);
	public List<Book>display();
	public String update(Book s);
	public String delete(long id);
}

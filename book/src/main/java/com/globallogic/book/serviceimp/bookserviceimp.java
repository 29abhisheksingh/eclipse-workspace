package com.globallogic.book.serviceimp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.book.entity.Book;
import com.globallogic.book.repo.Bookrepo;
import com.globallogic.book.service.bookserv;
@Component
public class bookserviceimp implements bookserv {

	@Autowired
	Bookrepo b; 
	@Override
	public String addbook(Book bk) {
		b.save(bk);
		return "Book Added";
	}

	@Override
	public List<Book> display() {
		
		return b.findAll();
	}

	@Override
	public String update(Book s) {
		b.save(s);
		return "Book Data Updated";
	}

	@Override
	public String delete(long id) {
		b.deleteById(id);
		return "Book Deleted";
	}

}

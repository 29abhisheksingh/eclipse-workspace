package com.globallogic.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.globallogic.book.entity.User;
@Component
public interface userserv {

	
	public String sucessSignin(long id,String email,String pass);
	public String use(User s);
	public List<User> showdet();
	public String update(User s);
	public String delete(long id);
}

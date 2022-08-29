package com.globallogic.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.globallogic.book.entity.Admin;
@Component
public interface adminserv {

	
	public String admi(Admin s);
	public List<Admin> showdet();
	public String update(Admin s);
	public String delete(long id);
	public String sucessSignin(long id,String email,String pass);
}


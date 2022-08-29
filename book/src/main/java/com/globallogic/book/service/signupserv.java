package com.globallogic.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.globallogic.book.entity.Signup;
@Component
public interface signupserv {

	
	public String signin(Signup s);
	public List<Signup> showdet();
	public String update(Signup s);
	public String delete(long id);

	}


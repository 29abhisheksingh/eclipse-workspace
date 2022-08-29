package com.globallogic.book.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.book.entity.Admin;
import com.globallogic.book.entity.Signup;
import com.globallogic.book.repo.Adminrepo;
import com.globallogic.book.repo.Signuprepo;
import com.globallogic.book.service.adminserv;
@Component
public class adminservimp implements adminserv {

	
	@Autowired
	Adminrepo a;
	
	@Autowired
	Signuprepo s;
	@Override
	public String admi(Admin s) {
		  a.save(s);
		return "admin added";
	}

	@Override
	public List<Admin> showdet() {
		return	a.findAll();
		
	}

	@Override
	public String update(Admin s) {
		a.save(s);
		return "admin details updated";
	}

	@Override
	public String delete(long id) {
		a.deleteById(id);
		return "admin removed";
	}

	@Override
	public String sucessSignin(long id, String email, String pass) {
		List<Signup> sign = s.findAll();
		for(Signup str:sign)
		{
			if(str.getId()==id && str.getEmail().equals(email) && str.getPass().equals(pass))
			{
				return "Login successful" ;
			}
		}
		return "Unsuccessful attempt";
		
		
		
	}

	
	
}

package com.globallogic.book.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.book.entity.Signup;
import com.globallogic.book.entity.User;
import com.globallogic.book.repo.Signuprepo;
import com.globallogic.book.repo.Userrepo;
import com.globallogic.book.service.userserv;
@Component
public class userservimp implements userserv {

	
	@Autowired
	Signuprepo s;
	
	@Autowired 
	Userrepo u;
	@Override
	public String sucessSignin(long id, String email, String pass) {
		List<Signup> sign = s.findAll();
		for(Signup str:sign)
		{
			if(str.getId()==id && str.getEmail().equals(email) && str.getPass().equals(pass))
			{
				return("Login successful");
			}
		}
		return "Unsuccessful attempt";
		
		
		
	}

	@Override
	public String use(User s) {
		u.save(s);
		return "user added";
	}

	@Override
	public List<User> showdet() {
		
		return u.findAll() ;
	}

	@Override
	public String update(User s) {
		u.save(s);
		return "updated";
	}

	@Override
	public String delete(long id) {
		u.deleteById(id);
		return "user deleted";
	}

}

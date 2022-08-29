package com.globallogic.book.serviceimp;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.book.entity.Signup;
import com.globallogic.book.repo.Signuprepo;
import com.globallogic.book.service.signupserv;
@Component
public class signupservimp  implements signupserv{

	
	@Autowired
	Signuprepo sr;
	@Override
	public String signin(Signup s) {
		sr.save(s);
		return "added";
	}

	@Override
	public List<Signup> showdet() {
		return sr.findAll();

	}

	@Override
	public String update(Signup s) {
		sr.save(s);
		return "details updated";
	}

	@Override
	public String delete(long id) {
		sr.deleteById(id);
		return "removed";
	}

}

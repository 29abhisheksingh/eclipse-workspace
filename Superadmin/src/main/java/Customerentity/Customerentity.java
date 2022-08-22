package Customerentity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@RequestMapping("/cust")
public class Customerentity {
	
	@Column
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customerentity(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customerentity [name=" + name + "]";
	}

}

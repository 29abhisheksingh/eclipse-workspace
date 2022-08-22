package webapp.Springcore;

import java.util.List;
import java.util.Set;

public class Employee {
	
	int id;
	String name;
	List<String> add;
	Set<String> con;
	
	

	
	public void setAdd(List<String> add) {
		this.add = add;
	}


	

	public void setCon(Set<String> con) {
		this.con = con;
	}


	public Employee()
	{
		
	}
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void display() {

		

		for (String a : add) {
			System.out.println(a);
		}
		
		for(String a: con)
		{
			System.out.println(a);
		}
}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + ", con=" + con + "]";
	}




	
	
	
	
}
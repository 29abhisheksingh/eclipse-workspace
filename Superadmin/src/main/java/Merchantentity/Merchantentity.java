package Merchantentity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Merchant")
public class Merchantentity {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	int pincode;
	
	@Column
	String location;
	
	@Column
	int gstno;
	
	
	

	public Merchantentity(int id, String name, int pincode, String location, int gstno) {
		super();
		this.id = id;
		this.name = name;
		this.pincode = pincode;
		this.location = location;
		this.gstno = gstno;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getGstno() {
		return gstno;
	}

	public void setGstno(int gstno) {
		this.gstno = gstno;
	}

	@Override
	public String toString() {
		return "Merchantentity [name=" + name + ", pincode=" + pincode + ", location=" + location + ", gstno=" + gstno
				+ "]";
	}
	
	

}

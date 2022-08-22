package Superadminentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import Categoryentity.Categoryentity;
import Customerentity.Customerentity;
import Merchantentity.Merchantentity;

@Entity
@Table(name="superadmin")
public class Superadminentity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String color;
	
	@Column
	double price;

	@OneToOne
	Merchantentity merch;
	
	@OneToOne
	Customerentity cust;
	
	@OneToOne
	Categoryentity cat;
	
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Superadminentity [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	public Superadminentity(int id, String name, String color, double price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	
}

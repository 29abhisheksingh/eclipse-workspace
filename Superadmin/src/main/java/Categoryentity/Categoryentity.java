package Categoryentity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@RequestMapping("/cat")
public class Categoryentity {
	
	@Column
	String category;

	public Categoryentity(String category) {
		super();
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Category [category=" + category + "]";
	}

}

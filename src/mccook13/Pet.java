
// Megan McCook 2073533
// Create a class named Pet

package mccook13;

import java.util.Date;

public abstract class Pet {
	// Create data fields
	private String name;
	private char gender;
	private Date acquired;
	// Create constructors
	public Pet() {
	}
	public Pet(String name, char gender, Date acquired) {
		this.name = name;
		this.gender = gender;
		this.acquired = acquired;
	}
	// Create getters
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public Date getAcquired() {
		return acquired;
	}
	// Create setters
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAcquired(Date acquired) {
		this.acquired = acquired;
	}
	// Create an abstract method 
	public abstract String sound();

}

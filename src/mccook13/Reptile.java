
// Megan McCook 2073533
// Create a class Reptile that extends the Pet class

package mccook13;

import java.util.Date;

public class Reptile extends Pet implements Mobility{
	// Create data field
	private String type;
	// Create constructors
	public Reptile(String type) {
		this.type = type;
	}
	public Reptile(String name, char gender, Date acquired, String type) {
		setName(name);
		setGender(gender);
		setAcquired(acquired);
		this.type = type;
	}
	// Implement abstract method from Mobility class
	@Override
	public String move() {
		return "Reptiles crawl, slither, and climb.";
	}
	// Implement abstract method from Pet class
	@Override
	public String sound() {
		return "Reptiles hiss and growl.";
	}
	// Create a toString method to display attributes of Reptile class
	public String toString() {
		return "This reptile is a " + type + " named " + getName() + "\nGender: " + 
				getGender() +  ", acquired: " + getAcquired() + "\n" + move() + "\n" + sound(); 
	}

}

// Megan McCook 2073533
// Create a class Dog that extends the class Pet

package mccook13;

import java.util.Date;

public class Dog extends Pet implements Mobility, Comparable<Dog>{
	// Create data fields
	private String breed;
	private int weight;
	// Create the constructors
	public Dog( String breed, int weight) {
		this.breed = breed;
		this.weight = weight;
	}
	public Dog(String name, char gender, Date acquired, String breed, int weight) {
		setName(name);
		setGender(gender);
		setAcquired(acquired);
		this.breed = breed;
		this.weight = weight;
	}
	// Create getters
	public String getBreed() {
		return breed;
	}
	public int getWeight() {
		return weight;
	}
	// Implement abstract method from Pet class
	@Override
	public String sound() {
		return "Dogs bark, howl, or occasionally growl.";
	}
	// Implement abstract method from Mobility class
	@Override
	public String move() {
		return "Dogs walk, run, jump, and zoom!";
	}
	// Create a toString method to display all the attributes of a Dog
	public String toString() {
		return "This dog is a " + breed + " named "  + getName() + "\nGender: " + 
				getGender() + ", acquired: " + getAcquired() + "\n" + sound() + 
				"\n" + move() + " Weight: " + weight;				
	}
	// Use the compareTo method to compare Dogs by weight
	@Override
	public int compareTo(Dog pet) {
		return this.weight - pet.weight;
	}

}

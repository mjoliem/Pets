
// Megan McCook 2073533
// Create a program named Automobile that uses the Comparable interface
// data fields will be make, model, year, and price
// add constructor, all getters, toString method, and Comparable by year
package mccook13;

public class Automobile 
	implements Comparable<Automobile> {
	// Create data fields 
	private String make;
	private String model;
	private int year;
	private double price;
	
	// Create a constructor
	public Automobile(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	// Create getters
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public double getPrice() {
		return price;
	}
	// create toString method for all attributes
	public String toString() {
		return "make: " + make + ", model: " + model + ", year: " + 
				year + ", price: " + price;
	}  
	// Insert the compareTo method 
	@Override
	public int compareTo(Automobile o) {
		return this.year - o.year;
			
	}

}


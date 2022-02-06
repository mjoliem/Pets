// Megan McCook 2073533
// Create a program that creates an ArrayList of Automobiles
// then use a for loop to display the elements,
// sort the ArrayList by year using Collections.sort()
// and display the sorted ArrayList using a foreach loop
package mccook13;

import java.util.ArrayList;
import java.util.Collections;


public class TestAutos {

	public static void main(String[] args) {
		// Create an ArrayList of five Automobiles
		ArrayList<Automobile> autos = new ArrayList<>();
		Automobile auto = new Automobile("Toyota", "Camry", 2009, 10000);
		autos.add(auto);
		Automobile auto1 = new Automobile("Toyota", "Prius", 2012, 15000);
		autos.add(auto1);
		Automobile auto2 = new Automobile("Honda", "Civic", 2020, 25000);
		autos.add(auto2);
		Automobile auto3 = new Automobile("Toyota", "Yaris", 2015, 17000);
		autos.add(auto3);
		Automobile auto4 = new Automobile("Honda", "Accord", 2019, 25000);
		autos.add(auto4);
		
		// Display the elements
		System.out.println("Unsorted List:");
		for (int i = 0; i < autos.size(); i++) {
			System.out.println(autos.get(i) + " ");
		}
		// Display the elements after sorting
		System.out.println("Sorted List:");
		Collections.sort(autos);
		for (Automobile a: autos) {
			System.out.println(a + " ");
		}	

	}

}

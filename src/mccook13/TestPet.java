package mccook13;
import java.util.Date;

public class TestPet {

	public static void main(String[] args) {
		// Create Date object
		Date date = new Date();
		// Create Reptile pet
		Reptile snake = new Reptile("Leslie", 'F', date, "Snake");
		// Display snake
		System.out.println(snake.toString());
		System.out.println();
		// Create an array of four dogs
		Dog[] dogs = new Dog[4];
		Dog dog0 = new Dog("Casper", 'M', date, "Sheltie", 20);
		dogs[0] = dog0;
		Dog dog1 = new Dog("Leonard", 'M', date, "Doberman", 30);
		dogs[1] = dog1;
		Dog dog2 = new Dog("Jasmine", 'F', date, "Labrador", 25);
		dogs[2] = dog2;
		Dog dog3 = new Dog("Miffy", 'F', date,  "Chihuahua", 10);
		dogs[3] = dog3;
		// Sort the Array
		java.util.Arrays.sort(dogs);
		// Print the sorted dogs Array
		System.out.println("All dogs sorted by weight:\n ");
		for (Dog pets: dogs) {
			System.out.println(pets + " ");
			System.out.println();
		}
	}

}

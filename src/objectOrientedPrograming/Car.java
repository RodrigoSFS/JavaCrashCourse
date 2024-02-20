package objectOrientedPrograming;

public class Car {
	
	String make = "Chebrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.00;
	
	void drive() {
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("You step on the brakes");
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + ", price=" + price
				+ "]";
	}
	
	
	
}

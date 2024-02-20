package objectOrientedPrograming;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Car> garage = new ArrayList<>();
	
	void park(Car car) {
		garage.add(car);
		System.out.println("The " + car.model + " is parked in the garage");
	}
	
}

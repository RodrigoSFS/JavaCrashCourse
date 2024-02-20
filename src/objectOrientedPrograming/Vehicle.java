package objectOrientedPrograming;

abstract public class Vehicle {
	
	double speed;
	
	abstract void go();
	
	abstract void stop();

}

// if the class is public, it has to be on it's own file
class Car2 extends Vehicle {
	int wheels = 4;
	int doors = 4;
	
	@Override
	void go() {
		System.out.println("VrumVrum");
	}
	
	@Override
	void stop() {
		System.out.println("The car has stoped");
	}
}

class Bike extends Vehicle {
	int wheels = 2;
	int pedals = 2;
	
	@Override
	void go() {
		System.out.println("Randam");
	}
	
	@Override
	void stop() {
		System.out.println("The Bike has stoped");
	}
}

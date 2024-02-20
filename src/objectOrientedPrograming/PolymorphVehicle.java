package objectOrientedPrograming;

abstract public class PolymorphVehicle {

	abstract public void go();
}

class PolymorphCar extends PolymorphVehicle{

	@Override
	public void go() {
		System.out.println("Vruum");
		
	}
	
}

class PolymorphBike extends PolymorphVehicle {

	@Override
	public void go() {
		System.out.println("Randam");
		
	}
	
}

class PolymorphBoat extends PolymorphVehicle {

	@Override
	public void go() {
		System.out.println("Blublublub");
		
	}
	
}
package objectOrientedPrograming;

public class CarPrivated {
	private String make;
	private String model;
	private int year;
	
	
	// because we have the getters and setters, we can make the constructor call the setters.
	CarPrivated (String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		
		// this.make = make;
		// this.model = model;
		// this.year = year;
	}
	
	// copy constructor
	CarPrivated(CarPrivated x){
		this.copy(x);
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	@Override
	public String toString() {
		String text = "Make: " + make + "\n" + "Model: " + model + "\n" + "Year: " + year;
		return text;
	}

	public void copy(CarPrivated car) {
		this.setMake(car.getMake());
		this.setModel(car.getModel());
		this.setYear(car.getYear());
		
	}
	
	
}

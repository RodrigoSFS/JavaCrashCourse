package objectOrientedPrograming;

public class Human {
	
	String name;
	double weight;
	
	public Human (String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		String myString = "Name: " + name + "\n" + "weight: " + weight;
		return myString;
		// return "Name: " + name + ", weight: " + weight;
	}
	
	
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
	
	void drink() {
		System.out.println(this.name + " is drinking");
	}
	
	

}

package objectOrientedPrograming;

public class Hero extends Person{

	String power;
	
	public Hero(String name, int age, String power){
		super(name,age);
		this.power = power;
	}
	
	public String toString() {
		String text = "\n" + "Power: " + power;
		return super.toString()+text;
	}
}

package objectOrientedPrograming;

public class Person {

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		String text = "Name: " + name + "\n" + "Age: " + age;
		return text;
	}
}

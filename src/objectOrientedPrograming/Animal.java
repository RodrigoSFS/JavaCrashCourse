package objectOrientedPrograming;

public class Animal {
	
	void speak() {
		System.out.println("dont know dude");
	}

}

class Dog extends Animal {
	
	@Override
	void speak() {
		System.out.println("Sup dude!");
	}
	
}

class Cat extends Animal {
	
	@Override
	void speak() {
		System.out.println("Meow Nigga");
	}
	
}

package objectOrientedPrograming;

import java.util.Scanner;

public class MainDynamicAnimals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you want: ");
		System.out.println("Dog: 1 ");
		System.out.println("Cat: 2 ");
		int num = scanner.nextInt();
		
		if (num == 1) {
			animal = new Dog();
			animal.speak();
		} 
		else if (num == 2){
			animal = new Cat();
			animal.speak();
		}
		else {
			System.out.println("Yu stupid");
			animal = new Animal();
			animal.speak();
		}

	}

}

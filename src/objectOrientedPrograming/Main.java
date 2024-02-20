package objectOrientedPrograming;

public class Main {

	public static void main(String[] args) {
		
		// OO 1 Objects
		
		// object = an instance of a class that may contain attributes and methods
		// example: (phone, desk, computer, coffee cup)
		
		//Car myCar = new Car();
		
		//System.out.println(myCar);
		//System.out.println(myCar.model);
		
		//myCar.drive();
		//myCar.brake();
		
		// OO 2 constructors
		
		//Human myHuman = new Human("Bob", 50);
		
		//System.out.println(myHuman);
		
		//myHuman.eat();
		//myHuman.drink();
		
		// OO 3 variable scope
		
		// local = declared inside a method
		//		   visible only to that method
		
		// global = declared outside a method, but within a class
		//			visible to all parts of a class
		
		// DiceRoller diceRoller = new DiceRoller();
		
		// OO 4 constructor overload
		
		// overloaded constructors =	multiple constructors within a class with the same name,
		// 								but have different parameters
		// 								name + parameters = signature
		
		// Pizza pizza1 = new Pizza();
		
		// OO 5 toString method
		
		// to String() = special method that all objects inherit,
		// 				 that returns a string that "textually represents" an object.
		//				 can be used both implicitly an explicitly
		
		// System.out.println(myHuman); implicitly
		// System.out.println(myHuman.toString()); explicitly
		
		// OO 6 array of Objects
		
		// int[] numbers = new int[3];
		// char[] characters = new char[3];
		// String[] strings = new String[3];
		
		// Food[] refrigerator = new Food[3];
		
		// Food food1 = new Food("Pizza");
		// Food food2 = new Food("Hamburguer");
		// Food food3 = new Food("Rice");
		
		// Food[] refrigerator = {food1, food2, food3};
		
		// refrigerator[0] = food1;
		// refrigerator[1] = food2;
		// refrigerator[2] = food3;
		
		// System.out.println(refrigerator[0].name);
		
		// OO 7 pass objects as arguments
		
		// Garage garage = new Garage();
		
		// Car car = new Car();
		// Car car2 = new Car();
		
		// garage.park(car);
		// garage.park(car2);
		
		// how the static keyword modifier works
		
		// static = modifier. A single copy of a variable/method is created and shared.
		// 					  the class "owns" the static member;
		//
		// can be applied in a variable, method or even classes.
		
		// This is owned by the class itself, so it doesn't even need to create a object
 
		// Friend friend1 = new Friend("Bob Esponja");
		// Friend friend2 = new Friend("Pataralho");
		// Friend friend3 = new Friend("Minha mãe");
		
		// System.out.println(Friend.numberOfFriends);
		// System.out.println(friend1.numberOfFriends); // it's best practice to use the type the name of the class
		// that owns the static member like the first print that uses the "Friend" class itself, followed by
		// the static member itself.
		
		// in the case of the removal of the static modifier, each of the objects created would have a copy of the
		// variable, and in order to print the value, we would have to use the name of the instance of the object
		// class, not the class itself, and the number would increase just once, to each of the instances, and it would
		// not be possible to make a static reference (to the static variable), changing back to static would make that
		// possible again, and the number of friends would increase as a whole, because it would exist only one copy
		// of the variable, within the Friend class itself, and it would increase on each instance of the Friend Class.
		// It would display the total amount of friends that the class created :)
		
		// that can also be applied not only to class variables, but also in class methods.
		
		// since the method is static, it is preferred to utilize the method by the class name and not by one of
		// it's instances.
		// Friend.displayFriends();
		
		// Math.round(a); the round method is a static method from the Math class, for example.
		
		// OO 8 inheritance
		
		// Car2 newCar = new Car2();
		// Bike bike = new Bike();
		
		// newCar.go();
		// bike.stop();
		 
		// System.out.println(bike.speed);
		// System.out.println(newCar.doors);
		// System.out.println(bike.pedals);
		
		// OO 9 method overriding
		
		// method overriding = Declaring a method in sub class,
		// 					   which is already present in parent class.
		// 					   done so that a child class can give its own implementation
		
		// Animal animal = new Animal();
		// Dog dog = new Dog();
		
		// dog.speak();
		
		// OO 10 super keyword
		
		// super = keyword refers to the superclass (parent) of a object
		// 		   very similar to the "this" keyword.
		
		// Hero superhero = new Hero("Batman",42, "Money");
		// Person normalperson = new Person("ZeNinguem",30);
		
		// System.out.println(superhero);
		// System.out.println(normalperson);
		
		// OO 11 abstract keyword
		
		// abstract = 	abstract classes cannot be instantiated, but they can have a subclass
		// 		   		abstract methods are declared without an implementation.
		
		// OO 12 encapsulation
		
		// encapsulation = attributes of a class will be hidden or private,
		// 				   Can be accessed only through methods (getters & setters)
		// 				   You should make attributes private if you don't have a reason
		// 				   to make them public or protected.
		
		// CarPrivated carPrivated = new CarPrivated("Nome", "CarraoBao", 1999);
		
		// carPrivated.toString();
		// carPrivated.getModel();
		
		// OO 13 copy objects
		
		// CarPrivated car1 = new CarPrivated("Chevrolet", "Camaro", 2021);
		// CarPrivated car2 = new CarPrivated("Ford", "Mustang", 2022);
		
		// car2.copy(car1);
		
		// CarPrivated car3 = new CarPrivated(car2);
		
		// System.out.println(car1);
		// System.out.println(car2);
		// System.out.println(car3);
		
		// when you write something like this: "car1 = car2", you are saying that both variables have the same 
		// memory address
		
		// OO 14 interfaces

		// interface =  a template that can be applied to a class.
		//				similar to inheritance, but specifies what a class has/must do.
		//				classes can apply more than one interface, inheritance is limited to 1 super
		
		// Rabbit rabbit = new Rabbit();
		
		// rabbit.flee();
		
		// Hawk hawk = new Hawk();
		
		// hawk.hunt();
		
		// Fish fish = new Fish();
		
		// fish.hunt();
		// fish.flee();
		
		// OO 15 polymorphism 
		//
		// 		 polymorphism  = greek word for poly-"many", morph-"Form"
		//						 the ability of an object to identify as more than one type
		
		//PolymorphCar car = new PolymorphCar();
		// PolymorphBike bike = new PolymorphBike();
		// PolymorphBoat boat = new PolymorphBoat();
		
		// it's useful because in that example, we need to store a those vehicles, but neither the data type
		// of the array, for each one of them, work, because there is none that can store all of them at the
		// same time, the solution for that, is to make a array of the type that those objects inherit.
		
		// the Car class identifies as a Car class, but also, a Vehicle class, and that works for every one of them
		// create a array of the data type that all the objects share in common.
		// PolymorphCar[] racers = {car,bike,boat}; 
		// PolymorphBike[] racers = {car,bike,boat}; 
		// PolymorphBoat[] racers = {car,bike,boat}; 
		
		// All objects are children classes of the Object class
		// Object[] racers = {car,bike,boat}; 
		// PolymorphVehicle[] racers = {car,bike,boat}; 
		
		// for-each loop using PolymorphVehicle, the father class of it's children objects.
		//for(PolymorphVehicle x: racers) {
		//	x.go();
		//}
		
		// for-each loop with the casting, using a array of Objects
		//for(Object x: racers) {
		//	((PolymorphCar) x).go();
		//}
		
		// OO 16 Dynamic polymorphism
		//
		//				 polymorphism = many shapes/forms
		//				 dynamic = after compilation (during runtime)
		
		// ex. A corvette is a: corvette, and a car, and a vehicle, and a object
		
		
		
		
		
	}

}

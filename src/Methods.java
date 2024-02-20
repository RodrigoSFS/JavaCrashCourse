
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// block of code that is executed whenever it is called upon
		
		String name = "Rodrigo";
		
		helloWorld(name);
	}
	
	// the convention for methods is to have the first letter always lower case
	// static means that it doesn't need to be called inside a object
	// void is the return type
	// public is encapsulation, it says that every other archive can use that method
	// that method doedn't have a argument
	static void helloWorld(String name)
	{
		System.out.println("Hello World " + name);
	}

}

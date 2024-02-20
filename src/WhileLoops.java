import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// While loop = executes a block of code as long as a it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		// method to return if a String is has a value or none
		// the do while loop guarantees that the block of code is executed at least once
		do 
		{
			System.out.println("Write your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		System.out.println("Your name is: " + name);
		
		name = "";
		
		while (name.isBlank())
		{
			System.out.println("Write your name: ");
			name = scanner.nextLine();
		}
		System.out.println("Your name is: " + name);
	}

}

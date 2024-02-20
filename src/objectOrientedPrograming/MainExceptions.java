package objectOrientedPrograming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExceptions {

	public static void main(String[] args) {
		
		// exception =	 an event that occurs during the execution of a program that,
		// 				 disrupts the normal flow of instructions
		
		Scanner scanner = new Scanner(System.in);

		try {
			
			System.out.println("Enter a number");
			int x = scanner.nextInt();
		
			System.out.println("Enter a number");
			int y = scanner.nextInt();
		
			int z = x/y;
		
			System.out.println("Result: " + z);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Can't devide by zero yu stupid!");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a number, are yu stupid????");
		}
		//lazy to use by itself, not best practice, used only like a last resort
		catch(Exception e) {
			System.out.println("Something went wrong...");
			System.out.println("Don't know what you did, but was stupid, yu stupid");
		}
		finally {
			System.out.println("exiting...");
			scanner.close();
		}
	}

}

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* logical operators = used to connect two or more expressions 
		 * 
		 * && = (and) both conditions must be true
		 * || = (or) either conditions must be true
		 * !  = (not) reverses boolean value of condition 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pressione q ou Q");
		String response = scanner.next();
		
		// to compare Strings, you got to use the equals() method
		
		if (response.equals("q") || response.equals("Q"))
		{
			System.out.println("You quit the game");
		}
		else
		{
			System.out.println("You are still playing the game ");
		}
	}

}

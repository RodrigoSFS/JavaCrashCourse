
public class Switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a more efficient way to use if statements
		
		String day = "Pizza";
		
		// the argument is the variable which will be compared to a list of conditions
		
		// if there's no breaks, when condition is matched, the block of code will be executed
		// as well with all the blocks of code under it
		switch(day)
		{
		case "Sunday": System.out.println("It is Sunday");
		break;
		case "Monday": System.out.println("It is Monday");
		break;
		case "Tuersday": System.out.println("It is Tuersday");
		break;
		case "Wednesday": System.out.println("It is Wednesday");
		break;
		case "Thrusday": System.out.println("It is Thrusday");
		break;
		case "Saturday": System.out.println("It is Saturday");
		break;
		case "Friday": System.out.println("It is Friday");
		break;
		default: System.out.println("That's not a day!");
		
		}
	}

}

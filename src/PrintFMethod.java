
public class PrintFMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printf() = an optional method to control format, and display text to the console window
		//			  two arguments = format string + (object/variable/value)
		//			  % [flags] [precision] [width] [conversion-characters]
		// 				flags	numbers	   characters
		
		// First is a String, the second is the value, inside the format String, the value will appear
		// where the flag % is, with "d" as decimal to show a decimal number: %d
		//System.out.printf("This is a format string %d", 123);
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Rodrigo";
		int myInt = 2;
		double myDouble = 1000;
		
		// [conversion-characters]
		//System.out.printf("%b", myBoolean);
		//System.out.printf("%c", myChar);
		//System.out.printf("%s", myString);
		//System.out.printf("%d", myInt);
		//System.out.printf("%f", myDouble);
		
		// [width]
		// minimum number of characters to be written as output
		//System.out.printf ("Hello %10s", myString);
		//System.out.printf ("Hello %-10s", myString);
		
		// [precision]
		// sets number of digits of precision when outputting floating-point values
		// the standard, %f, will show 6 zeroes after the decimal, we can limit the number of zeroes specifying a
		// conversion character
		// System.out.printf("You have this much money %.2f", myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if number > 1000
		
		// justify 
		// System.out.printf("You have this much money %20f", myDouble);
		
		// will show a plus when the number is positive and a minus when the number is negative.
		// System.out.printf("You have this much money %+f", myDouble);
		
		// pad with zeroes, the empty spaces that was justified will be filled with zeroes.
		// System.out.printf("You have this much money %020f", myDouble);
		
		// separate the thousands with a comma
		System.out.printf("You have this much money %,f", myDouble);
		System.out.printf("You have this much money %,.2f", myDouble);
		
		
	}

}

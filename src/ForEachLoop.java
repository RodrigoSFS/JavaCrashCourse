import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for-each = traversing technique to iterate through elements in a array/collection
		//			  less steps, more readable
		//			  less flexible
		
		// a ArrayList is a type of collection
		
		//String[] animals = new String[3];
		//String[] animals = {"cat","dog","rat","bird"};
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		// it works even with a ArrayList of Strings just like a Array of Strings.
		for(String i : animals)
		{
			System.out.println(i);
		}
	}

}

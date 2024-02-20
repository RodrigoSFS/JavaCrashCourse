import java.util.ArrayList;

public class ArrayListsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ArrayLists = a resizable array, a dinamic
		 * 				Array,
		 * 				Elements can be added and removed
		 * 				after compilation phase store reference
		 * 				data types*/
		
		// In order to use lists, we use reference data types
		ArrayList<String>food = new ArrayList<>();
		
		// adds to the list
		food.add("Pizza");
		food.add("Hamburguer");
		food.add("hotdog");
		
		// adds a element on a specific index, it replaces in the case of a existing element.
		food.set(0, "sushi");
		// we can remove in a specific index
		food.remove(2);
		// clears all of the items inside a list
		food.clear();
		
		// instead of .length we use the list.size(), and we use get, to pull a item by index.
		for(int i=0 ; i<food.size(); i++)
		{
			System.out.println(food.get(i));
		}
	
	}

}

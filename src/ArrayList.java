
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"Red", "Blue", "Green"};
		
		colors[0] = "Orange";
		
		// watch out for the element out of bounds error
		// a array is not dynamic, and only the same data type can be stores in a determined array
		//System.out.println(colors[2]);
		
		String[] comidas = new String[3];
		comidas[0] = "pao";
		comidas[1] = "mortadela";
		comidas[2] = "queijo";
		
		for (int i = 0 ; i<colors.length ; i++)
		{
			System.out.println(colors[i]);
		}
		
		
	}

}

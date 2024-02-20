
public class SwappingVariables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Water";
		String y = "Wine";
		
		String temp = x;
		x = y;
		y = temp;
		
		System.out.println(x + " " + y);
	}

}

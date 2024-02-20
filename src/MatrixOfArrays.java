
public class MatrixOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2D array = an array of arrays
		
		//String[][] colors = new String[3][3];
		String[][] colors = {{"blue", "black" ,"white"},
							{"Red", "green", "orange"},
							{"yellow", "purple", "pink"}};
		
		//colors[0][0] = "value";
		//colors[1][0] = "value";
		//colors[0][1] = "value";
		
		for (int lin = 0 ; lin<3 ; lin++)
		{
			System.out.println();
			for(int col = 0 ; col<3 ; col++)
			{
				System.out.print(colors[lin][col] + " ");
			}
		}
	}

}

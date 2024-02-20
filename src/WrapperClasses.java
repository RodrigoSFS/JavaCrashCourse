
public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* wrapper class = provides a way to use primitive
		 * 					data types as reference 
		 * 					data types,
		 * 					reference data types contain
		 * 					useful methods,
		 * 					can be used with collections
		 * 					(ex: ArrayLists)*/
		/* the disadvantage of reference data types
		 *  is that they are slower and takes more memory */ 
		
		// String are already reference data types
		
		/*
		 * primitive		wrapper
		 * ---------		-------
		 * boolean			Boolean
		 * char				Character
		 * int				Integer
		 * double			Double
		 * 
		 * autoboxing = the automatic conversation that java
		 * 				Compiler makes between the primitive
		 * 				types and their corresponding object 
		 * 				wrapper classes 
		 * 
		 * unboxing = the reverse of autoboxing. Automatic
		 * 			  conversion of wrapper class to primitive*/
		
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Rodrigo";
		
		if(a==true)
		{
			System.out.println("This is true");
		}
	
	}

}

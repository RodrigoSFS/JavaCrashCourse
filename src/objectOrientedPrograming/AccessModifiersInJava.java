package objectOrientedPrograming;

public class AccessModifiersInJava {
	public String publicMessage = "this is public";
	protected String protectedMessage = "This is protectec";
		   String defaultAccessMessage = "This is the default";
	private String privateMessage = "This is privated";
	
	// public 	 = makes a class, method, or variable accessible from anywhere. It has the widest visibility.
	
	// protected = allows access to a class, method, or variable within the same package or by subclasses, 
	// 			   even if they are in a different package.

	// private 	 = restricts the visibility of a class, method, or variable to within the same class. 
	//		     It is not visible to other classes, even if they are in the same package.
	
	// default 	 = This means the class, method, or variable is accessible within the same package 
	//			   but not from classes in different packages.


}

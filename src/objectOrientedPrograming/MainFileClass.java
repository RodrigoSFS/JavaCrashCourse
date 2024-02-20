package objectOrientedPrograming;

import java.io.File;

public class MainFileClass {

	public static void main(String[] args) {
		
		// file = An abstract representation of file and directory pathnames.
		// the file is firstly searched on the project folder as the initial directory.
		// if a file is on some place else, it has to be specified the path.
		File file = new File("C:\\Users\\rodri\\eclipse-workspace\\MyFirstProgram\\src\\objectOrientedPrograming");
		
		if(file.exists()) {
			System.out.println("It exists");
			System.out.println(file.getPath()); // whatever is listed in the constructor of the file object
			System.out.println(file.getAbsolutePath()); // the location of the file in the computer.
			System.out.println(file.isFile()); // returns true or false if file is a file or not
			System.out.println(file.isDirectory()); // returns true or false if file is a directory or not

			file.delete(); // will delete file after running it
		} else {
			System.out.println("It doesn't exist");
		}
	}

}

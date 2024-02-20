package objectOrientedPrograming;

import java.io.FileWriter;
import java.io.IOException;

public class MainFileWritter {

	public static void main(String[] args) {
		
		// writing a file
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue \nidk dude i don't know how to read :/");
			writer.append("\nBy Estevaldo ferreira");
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}

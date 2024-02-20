package objectOrientedPrograming;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


import javax.sound.sampled.*;
public class sounds {
	
	public static void clearScreen() {
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
	  }

	public static void main(String[] args) throws LineUnavailableException {
		Scanner sc = new Scanner(System.in);
		
		File file = new File("Deixa.wav");
		// adds throw declaration, or a try block
		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			// as soon as the program runs out of code, it get's terminated, so we have to make the computer
			// wait a bit.
			
			String response = "";
			
			while(!response.equals("Q")) {
				System.out.print("P = play \nS = Stop\nR = Reset\nQ = Quit");
				System.out.println();
				System.out.println("Enter your response");
				
				response = sc.next();
				response = response.toUpperCase();
				
				switch(response) {
					case ("P"): clip.start();
					clearScreen();
					break;
					case ("S"): clip.stop();
					clearScreen();
					break;
					case ("R"): clip.setMicrosecondPosition(0);
					clearScreen();
					break;
					case ("Q"): clip.close();
					clearScreen();
					break;
					default: System.out.println("Not a valid response");
				}
			}
			
			
			
			
			
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("exiting...");
		}
		
		
	}

}

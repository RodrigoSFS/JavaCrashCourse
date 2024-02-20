package JavaSwingTutorial;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// GUI 1 JPanel
		
		// JFrame = a GUI window to add components to
		
		JFrame frame = new JFrame();
		
		frame.setTitle("jFrame title goes here"); // sets title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out the application, default is hide.
		frame.setResizable(false); // prevent frame from being resized
		frame.setSize(420, 420); // sets the x-dimension, and y-dimension on frame
		frame.setVisible(true); // make the frame visible

		ImageIcon image = new ImageIcon("logo.png"); // create an ImageIcon
		frame.setIconImage(image.getImage()); // change icon of frame
		frame.getContentPane().setBackground(new Color(0x123456)); // change color of background,
		//															  we can use default colors, rgb values, 
		//															  or hex code on that object															  or hex code on that object						
		
		// we can also just not specify a name to MyFrame, like:
		// new MyFrame();
		// if we will only use one frame of that kind, and will not make changes with it,
		// in the case of making some chances, it will be required to specify the name of the object to
		// edit it's properties 
		 MyFrame myFrame = new MyFrame();
		
		
		
		
		
		
	}

}

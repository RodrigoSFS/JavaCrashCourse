package JavaSwingTutorial;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyFrame() {
		
		this.setTitle("JFrame title goes here"); // sets title of the this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out the application, default is hide.
		this.setResizable(false); // prevent this from being resized
		this.setSize(420, 420); // sets the x-dimension, and y-dimension on this
		this.setVisible(true); // make the this visible
		
		ImageIcon image = new ImageIcon("logo.png"); // create an ImageIcon
		this.setIconImage(image.getImage()); // change icon of this
		this.getContentPane().setBackground(new Color(0x123456));
	}
}

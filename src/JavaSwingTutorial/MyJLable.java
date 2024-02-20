package JavaSwingTutorial;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyJLable {

	public static void main(String[] args) {
		
		// GUI 2 JLabel
		// JLabel = a GUI display area for a string of text, an image, or both

		// A label is a component, a JFrame is where we put the diverse components, so we need a JFrame

		// to add text on the label, you can pass the String as a argument of the JLabel constructor
		// or you can use the setText method to assign one.
		
		ImageIcon image = new ImageIcon("C:\\Users\\rodri\\OneDrive\\Área de Trabalho\\Mídia\\Imagens\\Foto Perfil.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3); // creates a border, border color and width
		// needs to be set on the label, just like the image, and just like the label itself on the Frame
				
		JLabel label = new JLabel(); // create a label
		label.setText("Isso e um JLabel"); // set text of label
		// when it set's a image, it likes to put the string on the right side of the label as well.
		// but we can move the text of the label, relatively to the image, with those functions
		label.setIcon(image);
		// horizontal position
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT, of image icon
		// vertical position
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM, of image icon
		// change the font color and the font style of the text
		// color
		label.setForeground(Color.black); // set color of text
		// label.setForeground(new Color(0x123456));
		// font
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20)); // set font of text, type and size
		// you can also edit the gap between the image and the text
		label.setIconTextGap(10); // set gap of text to image
		// you can also set the background color, but we need to set the color and the Opaque boolean value
		// by default, the label likes to take all the room as possible, it has no bounds, it takes the entire screen
		// as the screen expands, the label expands as well 
		// as default, the entire area is the label.
		// we have some methods to move the label around, but it's not possible if the entire screen is the label.
		label.setBackground(new Color(0x123456)); // set background color
		label.setOpaque(true); // paints every pixel within its bounds, display background color
		label.setBorder(border);
		// you can move the text as well as the image within a label around, by default it likes to be in the center
		// horizontally and on the left vertically
		// we can set where the image and the text is within the label
		//						LEFT, CENTER, RIGHT
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within the label
		//						  TOP, CENTER, BOTTOM
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within the label
		// here we set the x and y, width and height, position within frame as well as dimensions
		// label.setBounds(100,0,250,250); // distances and sizes by pixels.
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setResizable(true);
		frame.setVisible(true);
		// the default layout of the frame is the "border layout", it takes the String or images (components),
		// put in the center, and puts on the left side of the frame, the layout is completely customizable.
		// without customizing the default layout manager, that is set to "border layout", we can set it to null
		// and place the label exactly where we want to
		// when we do this, the label will not be displayed, because the bound would be needed to be set, where we
		// want to the label be set, the coordinates, x and y, width and height.
		// frame.setLayout(null);
		frame.add(label);
		frame.pack(); // this will resize the size of the frame to accommodate all of it's components currently
		//inside.
		// using this method, if the text size is changed for example, the dimensions wound change accordingly
		// to accommodate the size of the text within the label
		// using the pack method, make sure to add all the components *before* using the pack method, otherwise 
		// it dosen't work

	}

}

package JavaSwingTutorial;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJPanel {

	public static void main(String[] args) {
		// GUI 3 JPanel
		// JLabel = a GUI component that functions as a container to hold other components
		
		ImageIcon icon = new ImageIcon("C:\\Users\\rodri\\OneDrive\\Área de Trabalho\\Mídia\\Imagens\\Foto Perfil.png");
		
		JLabel label = new JLabel();
		label.setText("HI");
		label.setIcon(icon);
		// it doesn't need those lines if we're not using a layout manager, it's something that it's used on
		// border layouts
		//label.setVerticalAlignment(JLabel.CENTER);
		//label.setHorizontalAlignment(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setBounds(100,100,75,75); // it will place on the coordinates related within the panel that it is in
		
		// with the JLabel made, we can add this within the Frame, or the Panel

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		// since the layout is null, we have to set the coordinates and the dimensions of the panels
		//				x, y, width, height
		redPanel.setBounds(0,0,250,250);
		redPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		// since the layout is null, we have to set the coordinates and the dimensions of the panels
		//				x, y, width, height
		bluePanel.setBounds(250,0,250,250);
		// bluePanel.setLayout(new BorderLayout());
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		// since the layout is null, we have to set the coordinates and the dimensions of the panels
		//				x, y, width, height
		greenPanel.setBounds(0,250,500,250);
		// greenPanel.setLayout(new BorderLayout()); // it's going to put the components to the center vertically,
		// and on the left horizontally
		// and we can use set horizontal and set vertical to move this label around within the container, and we can
		// also put no layout managers to say exactly the coordinates and sizes
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setTitle("jFrame title goes here"); // sets title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out the application, default is hide.
		frame.setLayout(null);
		frame.setSize(750, 750); // sets the x-dimension, and y-dimension on frame
		frame.setVisible(true); // make the frame visible
		frame.add(redPanel);
		redPanel.add(label);
		bluePanel.add(label);
		// panels use flow layouts by default
		// flow layouts = with components that you add to a container that is using a flow layout manager,
		// it will take all these components stick them to the top and center them, and will add components until
		// the first roll is filled, when it does, it's going to add components on the second row
		// greenPanel.add(label);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}

}

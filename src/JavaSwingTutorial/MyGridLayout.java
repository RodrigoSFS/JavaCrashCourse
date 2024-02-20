package JavaSwingTutorial;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGridLayout {

	public static void main(String[] args) {
		// Layout Manager = Defines the natural layout for components within a container
		
		// Grid Layout    = places components in a grid of cells.
		//					Each component takes all the available space within its cell,
		//					and each cell is the same size.
		
		// frames by default use border layouts
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		//		rows(r), columns(c), horizontal spacing(h), vertical spacing(v)
		//							   r c h v
		frame.setLayout(new GridLayout(3,3,10,10)); // sets a new grade layout, by default, it adds all components on it's
		//									  own columns, but we can specify the number of rows and columns.
		frame.setVisible(true);
		
		// JButton button1 = new JButton("1");
		
		frame.add(new JButton("1")); // anonymous button
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		// frame.add(new JButton("10")); // if the number of the grid doesn't fits, it will create another column,
										 // trying to fit in the best way it can
		

	}

}

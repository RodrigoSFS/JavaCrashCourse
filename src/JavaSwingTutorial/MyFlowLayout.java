package JavaSwingTutorial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFlowLayout {

	public static void main(String[] args) {
		// Layout Manager = Defines the natural layout for components within a container
				
		// Flow Layout    = A FlowLayout places components in a row at their preferred size.
		//					If the horizontal space in the container is too small,
		//					the FlowLayout class uses the next available row.

		// instantiate, defaultClose, size, visible
		// set layout to set the layout, duh
		// by default, frames use a borderLayout
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		//												  v  h    spacing 
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10)); // We can pass a alignment to the flow layout, 
										   				    // of where we want it to start
		
		// instantiate, PreferredSize (new Dimension()), setBackground(Color.someColor), LayoutManager
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout()); // by default, panels already use the flow Layout
		
		// A shortcut to creating components, instead of creating buttons for example, and than adding to 
		// the frame, like this:
		
		//JButton button1 = new JButton();
		//frame.add(button1);
		
		// We can instantiate the button inside the frame.add function, and pass the number of the button as
		// a argument of the constructor of the button, setting it's number, like this:
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);
		
		frame.setVisible(true); // the components must be added before the setVisibility(true)
		// otherwise, the component does't appear.
		
		
	}

}

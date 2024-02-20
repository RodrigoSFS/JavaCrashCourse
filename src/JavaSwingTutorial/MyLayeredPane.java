package JavaSwingTutorial;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyLayeredPane {

	public static void main(String[] args) {
		
		// JLayeredPane    = Swing container that provides a third dimension
		//					 for positioning components
		//					 example: depth, Z-index
		
		JLayeredPane layeredPane = new JLayeredPane();
		//					  x y  w   h
		layeredPane.setBounds(0,0,500,500);
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150,150,200,200);
		
		// set the layer of the component
		// but we don't need to remember the names, instead we can pick a number, and each number is associated
		// with on of the layers.
		//layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		//layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
		//layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
		
		// the higher the number the higher the place the place of it will stack up on top each other
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(2));
		layeredPane.add(label3, Integer.valueOf(1));
		
		// By default, the first component that is added, will appear at the top, the the subsequent ones
		// will appear under the previous one, and so one and so forth
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(layeredPane);
		
		

	}

}

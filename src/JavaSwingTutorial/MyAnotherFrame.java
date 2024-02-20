package JavaSwingTutorial;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyAnotherFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	
	
	MyAnotherFrame(){
		
		ImageIcon icon = new ImageIcon("C:\\Users\\rodri\\OneDrive\\Área de Trabalho\\Mídia\\Imagens\\Putinum.png");
		ImageIcon icon2 = new ImageIcon("C:\\Users\\rodri\\OneDrive\\Área de Trabalho\\Mídia\\Imagens\\Foto Perfil.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
		button = new JButton();
		button.setBounds(100,100, 50,50);
		//button.setBounds(100,100,250,500);
		button.addActionListener(this);
		button.setText("vo bomardea a xina");
		button.setFocusable(false); // get's rid of the annoying box on the text
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Times New Roman", Font.BOLD,25));
		button.setIconTextGap(-30);
		button.setForeground(Color.black);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		// this is a lambda expression, it makes the same thing without the need to implement the action listener
		// to the frame, nor to override the method and reference "this" JFrame that has the
		// ActionListener implemented
		// button.addActionListener(e -> System.out.println("oi"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out the application, default is hide.
		this.setLayout(null);
		this.setSize(500, 500); // sets the x-dimension, and y-dimension on this
		this.setVisible(true); // make the this visible
		this.add(button);
		this.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("I got clicked");
			//button setEnable(false); when you click on the button once, it disables it
			label.setVisible(true);
		}
		
	}

}

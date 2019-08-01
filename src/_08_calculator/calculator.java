package _08_calculator;

import java.awt.event.KeyAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculator extends KeyAdapter{
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JLabel label= new JLabel();
	
	public void run() {
		frame.add(panel);
		panel.add(label);
	}
	
	
	

}

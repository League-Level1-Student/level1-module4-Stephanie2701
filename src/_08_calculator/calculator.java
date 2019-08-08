package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends KeyAdapter implements ActionListener{
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton button1= new JButton();
	JButton button2= new JButton();
	JButton button3= new JButton();
	JButton button4= new JButton();
	JLabel label= new JLabel();
	JTextField textfield= new JTextField();
	JTextField textfield2= new JTextField();
	
	
	
	
	public void createUI() {
		frame.add(panel);
		panel.add(textfield);
		panel.add(textfield2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		
		
		textfield.setPreferredSize(new Dimension(180,20));
		textfield2.setPreferredSize(new Dimension(180,20));
		frame.setVisible(true);
		
		button1.setText("add");
		button2.setText("subtract");
		button3.setText("multiply");
		button4.setText("divide");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.pack();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			add();
		
			
		}
		if(e.getSource()==button2) {
			subtract();
	
			
		}
		if(e.getSource()==button3) {
			multiply();
		}
		if(e.getSource()==button4) {
			divide();
		}
	
	
		
		
	}
	private void divide() {
		// TODO Auto-generated method stub
		String b=textfield.getText(); 
		int p= Integer.parseInt(b);
		String o =textfield.getText();
		int z = Integer.parseInt(o);
		
		int answer = p / z;
		label.setText(Integer.toString(answer));
	}
	private void multiply() {
		// TODO Auto-generated method stub
		String b=textfield.getText(); 
		int p= Integer.parseInt(b);
		String o =textfield.getText();
		int z = Integer.parseInt(o);
		
		int answer = p * z;
		label.setText(Integer.toString(answer));
		
	}
	private void subtract() {
		// TODO Auto-generated method stub
		String b=textfield.getText(); 
		int p= Integer.parseInt(b);
		String o =textfield.getText();
		int z = Integer.parseInt(o);
		
		int answer = p - z;
		label.setText(Integer.toString(answer));
		
		
	}
	private void add() {
		// TODO Auto-generated method stub
		String a=textfield.getText(); 
		int r= Integer.parseInt(a);
		String e1 =textfield.getText();
		int y = Integer.parseInt(e1);
		
		int answer = r + y;
		label.setText(Integer.toString(answer));
		
		
	}
		
	
	

}

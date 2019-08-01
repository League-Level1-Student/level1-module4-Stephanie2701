package _05_typing_tutor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingtutor implements KeyListener{
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JLabel label= new JLabel();
	Date timeAtStart = new Date();
	char currentLetter=generateRandomLetter();
	int numberOfCorrectCharactersTyped=20;
	int a=0;
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');	
	}
	public static void main(String[] args) {
		new typingtutor().createUI();
	}
	
	
	void createUI() {
	frame.add(panel);
	panel.add(label);
	
	label.setText(currentLetter+"");
	
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(label.CENTER);
	frame.addKeyListener(this);
	
	
	
	frame.setVisible(true);
	frame.pack();
	}
	
	
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	  
	  
		Date timeAtEnd=new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	
	public void keyTyped(KeyEvent e) {
		if(a>=5) {
			showTypingSpeed(a);
		
		}
		
	}
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		System.out.println("you typed:"+ e.getKeyChar());
		if(e.getKeyChar()==currentLetter) {
			System.out.println("Correct!");
			a++;
			panel.setBackground(new Color(51,204,51));
			
		}
		else {
			
			panel.setBackground(new Color(255,0,0));
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter=generateRandomLetter();
		label.setText(currentLetter+"");
		
		
	}
	
	
	
	
	
	
	
	}

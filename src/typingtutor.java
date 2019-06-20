import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingtutor implements ActionListener{
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JLabel label= new JLabel();
	
	char currentLetter=generateRandomLetter();
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText(null);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(null);
		char currentLetter=generateRandomLetter();
		if(e.getSource()=="correct") {
			frame.setBackground(Color.GREEN);
		}
			else {
				frame.setBackground(Color.red);
			}
			
		Date timeAtStart = new Date();
		}
	
	private void keyReleased() {
		
	}
	void createUI() {
	frame.add(panel);
	panel.add(label);
	
	frame.setVisible(true);
	frame.pack();
	}
	
    
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	  
	    java.util.Date timeAtStart;
		java.util.Date timeAtEnd;
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
	
	
	
	
	
	
	}

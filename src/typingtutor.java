import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingtutor {
	JFrame frame;
	JPanel panel;
	JLabel label;
	
	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setVisible(true);
		
		
		char currentLetter;
		currentLetter = RandomLetter();
		
	//	JLabel label= new JLabel();
	

		
	}

	private static char generateRandomLetter() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	static char RandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	
	
}
}

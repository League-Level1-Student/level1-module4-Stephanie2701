package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener{
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton button= new JButton();
	JTextField textfield1= new JTextField(30);
	JTextField textfield= new JTextField(30);
	
	
	
	
	public void CreateUI() {
		frame.add(panel);
		panel.add(textfield);
		panel.add(button);
		panel.add(textfield1);
		button.addActionListener(this);
		frame.setVisible(true);
		frame.setTitle("Stephanie's Pig Latin Translator");
		button.setText("Translate");
		frame.pack();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String l =translate(textfield.getText());
			textfield.in
			
			
		}
		
	}
	private static boolean isLetter(char c) {
		return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
		}
		    
	public String translate(String s) {
		String latin = "";
		int i = 0;
		while (i < s.length()) {
		// Take care of punctuation and spaces
		while (i < s.length() && !isLetter(s.charAt(i))) {
		latin = latin + s.charAt(i);
		i++;
		}
		// If there aren't any words left, stop.
		if (i>=s.length()) break;
		// Otherwise we're at the beginning of a word.
		int begin = i;
		while (i < s.length() && isLetter(s.charAt(i))) {
		i++;
		}
	}

}
}

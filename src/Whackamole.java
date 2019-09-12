import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Whackamole implements ActionListener{
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton molebutton= new JButton("mole");
	
	
	
	public void CreateUI(int mole) {
		frame.add(panel);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.setSize(new Dimension(300,300));

		
		
		
		for (int i = 0; i < 24; i++) {
			if(i==mole) {
				molebutton.addActionListener(this);
				panel.add(molebutton);
				
				  
			}
			else {
				
			
			
		JButton button= new JButton();
		button.addActionListener(this);	
		panel.add(button);
		frame.setVisible(true);
			}
			
		}
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()!=molebutton) {
				speak("no wrong button");
				
			}
		}
		
		
				
	
	
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	
		
	}



package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Whackamole implements ActionListener{
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton molebutton= new JButton("mole");
	Date timeAtStart= new Date();
	int moleswhacked=0;
	



	public void CreateUI(int mole) {
		frame.add(panel);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.setSize(new Dimension(300,300));
		
		
		
		
		
		for (int i = 0; i < 24; i++) {
			if(i==mole) {
				molebutton.addActionListener(this);
				panel.add(molebutton);


			} else {

				JButton button= new JButton("  " );
				button.addActionListener(this);	
				panel.add(button);
				frame.setVisible(true);
			}
			
			
			
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Random f= new Random();
		
		
		if(e.getSource()!=molebutton) {
			speak("no, wrong button!");
			

		}else {
				
			speak("Right Button!");	
			moleswhacked++;
			frame.dispose();
			CreateUI(f.nextInt(34));
		
		if(moleswhacked==5){
			endGame(timeAtStart,5);
			
			
		}
		}
			
	}
	
		
	void speak(String words) { 
	    try { 
	        JOptionPane.showMessageDialog(null, words);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");


}
}
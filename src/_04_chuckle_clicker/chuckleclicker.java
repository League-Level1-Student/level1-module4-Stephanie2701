package _04_chuckle_clicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class chuckleclicker implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline= new JButton();
	public static void main(String[] args) {
		new chuckleclicker().createUI();
	}
	void createUI(){
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		frame.setVisible(true);
		joke.setText("Joke");
		punchline.setText("Punchline");
		
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== joke ) {
			JOptionPane.showMessageDialog(null, "hi");
		}
		else if(e.getSource()==punchline) {
			JOptionPane.showMessageDialog(null, "hi");
			
		}
		if(e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "Why did the teddy bear say no to dessert?" + 
					"...." + "Because she was stuffed.");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "punchline button");
		}
		
	}
	
	

}

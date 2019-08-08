package _09_latest_tweet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class latesttweet implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel=new JPanel();
	JButton button= new JButton();
	JTextField textfield= new JTextField();
	
	public void CreateUI() {
		frame.add(panel);
		panel.add(textfield);
		panel.add(button);
		button.addActionListener(this);
		frame.setVisible(true);
		frame.setTitle("The Amazing Tweet Retriever");
		button.setText("Search the Twitterverse");
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

package _13_online_practice_quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
	
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton spin= new JButton("spin");
	JLabel label= new JLabel();
	String cherryfile="src/cherries.png";
	String sevenfile="scr/7.jpg";
	String barfile="scr/bar.png";
	
	
	
	public void CreateUI() {
		frame.add(panel);
		panel.add(spin);
		panel.add(label);
		spin.addActionListener(this);
		
		
	}


	
	public void actionPerformed(ActionEvent e) {
		Random r= new Random();
		
		if(e.getSource().equals(spin)) {
			JLabel reel 1=createLabelImage(r);
			
			
		}
			
		}
		
		
		
		
		private JLabel createLabelImage(String fileName) throws MalformedURLException{
	        URL imageURL = getClass().getResource(fileName);
		if (imageURL == null){
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

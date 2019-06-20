import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise implements ActionListener{
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton("trick");
	JButton button1=new JButton("treat");
	public static void main(String[] args) {
		new nastysurprise().createUI();
		
	}
	
	void createUI() {
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
		 frame.setVisible(true);
	        frame.pack();
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
		 
			showPictureFromTheInternet("https://i.pinimg.com/originals/bf/80/88/bf808800e8e1c409eab2fba053bfe7ca.jpg");
		}
		else if(e.getSource()==button1){
			showPictureFromTheInternet("https://www.rd.com/wp-content/uploads/2017/10/We-Say-That-Ghosts-Say-Boo-But-Why-_330536861_Lemon-Tree-Images-1024x683.jpg");
		}
	}
	
	
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame newFrame = new JFrame();
	        newFrame.add(imageLabel);
	        newFrame.pack();
	        newFrame.setVisible(true);
	       
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	

}

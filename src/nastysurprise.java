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
			showPictureFromTheInternet("https://thenypost.files.wordpress.com/2018/10/102318-dogs-color-determine-disesases-life.jpg?quality=90&strip=all&w=1236&h=820&crop=1");
		}
		else {
			showPictureFromTheInternet("https://www.rd.com/wp-content/uploads/2017/10/We-Say-That-Ghosts-Say-Boo-But-Why-_330536861_Lemon-Tree-Images-1024x683.jpg");
		}
	}
	
	
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	       
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	

}

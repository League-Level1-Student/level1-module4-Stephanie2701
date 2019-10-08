package _12_slot_machine;

import java.awt.Component;
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

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton("spin");
	JLabel label1 = new JLabel();

	String cherryfile = "src/cherries.png";
	String sevenfile = "scr/7.jpg";
	String barfile = "scr/bar.png";

	public void CreateUI() {
		frame.add(panel);
		panel.add(spin);
		panel.add(label1);
		spin.addActionListener(this);

		frame.setVisible(true);
		frame.pack();
	}

	public void actionPerformed(ActionEvent e) {

		Random a = new Random();
		int reel = a.nextInt(3);
		int reel2 = a.nextInt(3);
		int reel3 = a.nextInt(3);
		if (e.getSource() == spin) {
		System.out.println("ap");
			try {

				if (reel == 3) {

					panel.add(createLabelImage("7.jpg"));

				} else if (reel == 2) {
					panel.add(createLabelImage("bar.png"));
				} else if (reel == 1) {
					panel.add(createLabelImage("Cherries.png"));

				}
				if (reel2 == 3) {

					panel.add(createLabelImage("bar.png"));
				} else if (reel2 == 2) {
					panel.add(createLabelImage("7.jpg"));
				} else if (reel2 == 1) {
					panel.add(createLabelImage("Cherries.png"));
				}
				if (reel3 == 3) {

					panel.add(createLabelImage("Cherries.png"));

				} else if (reel3 == 2) {
					panel.add(createLabelImage("7.jpg"));

				}

				else if (reel3 == 1) {
					panel.add(createLabelImage("bar.png"));
				}

			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
System.out.println("end");
	}

	private JLabel createLabelImage(String r) throws MalformedURLException {
		URL imageURL = getClass().getResource(r);
		if (imageURL == null) {
			System.err.println("Could not find image " + r);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

}

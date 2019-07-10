package drum_kit;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel drumLabelWithImage;
	JLabel drumLabelWithImage1;
	JLabel drumLabelWithImage2;

	public void run() throws MalformedURLException {

		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame JF = new JFrame();
		// 2. Make the frame visible and
		JF.setVisible(true);
		// set its default close operation to JFrame.EXIT_ON_CLOSE
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Set the size of the frame
		JF.setSize(233, 344);
		// 4. Set the title of the frame
		JF.setName("Frame");
		// 5. Make a JPanel variable and initialize it using "new JPanel().
		JPanel JP = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		JF.add(JP);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".

		// 8. Put the name of your image file in a String variable.
		String imagename = "drum picture.png";
// 9. Edit the next line to use your String variable
		drumLabelWithImage = createLabelImage(imagename);

		// 10. Add the image to the panel
		JP.add(drumLabelWithImage);
		// 11. Set the layout of the panel to "new GridLayout()"
		JP.setLayout(new GridLayout());
		// 12. call the pack() method on the frame. Run your program. Do you see
		// your drum image?
		JF.pack();
		// 13. add this mouse listener to drumLabelWithImage
		drumLabelWithImage.addMouseListener(this);
		// 18. Add more images to make a drumkit. Remember to add this mouse
		// listener to each one.
		String imagename2 = "drum pic 1.jpg";
		drumLabelWithImage1 = createLabelImage(imagename2);
		JP.add(drumLabelWithImage1);
		drumLabelWithImage1.addMouseListener(this);

		String imagename3 = "drum pic.png";
		drumLabelWithImage2 = createLabelImage(imagename3);
		JP.add(drumLabelWithImage2);
		drumLabelWithImage2.addMouseListener(this);

	}

	public void mouseClicked(MouseEvent e) {
		// 14. Print "mouse clicked" to the console. Run your program and watch
		// the console to see when this is printed.

		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label
														// that the mouse
														// clicked on

		// 15. Download a drum sound and drop it into your "default package".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.

		// 16. If they clicked on the drumImage...
		if (drumClicked.equals(drumLabelWithImage)) {
			playSound("drum.wav");
		}
		if (drumClicked.equals(drumLabelWithImage1)) {
			playSound("drumsound2.wav");
		}
		if (drumClicked.equals(drumLabelWithImage2)) {
			playSound("drum sound 3.wav");
		}
		// 17. ...use the playSound method to play a drum sound. Test to see if
		// it works

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

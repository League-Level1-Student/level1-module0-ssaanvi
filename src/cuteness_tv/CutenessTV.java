package cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	void startprogram () {
		JPanel JP = new JPanel() ;
		JFrame frame = new JFrame();
	frame.add(JP);
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
	
	JPanel JP2 = new JPanel() ;
	JFrame frame2 = new JFrame() ; 
	frame.add(JP2);
	frame2.setVisible(true);
	JButton button2 = new JButton();
	frame2.add(button2);
	frame2.pack();
	button2.addActionListener(this);
	
	JPanel JP3 = new JPanel() ;
	JFrame frame3 = new JFrame() ; 
	frame.add(JP3);
	frame3.setVisible(true);
	JButton button3 = new JButton();
	frame3.add(button3);
	frame3.pack();
	button3.addActionListener(this);
JButton buttonPressed = (button);
	
	if (buttonPressed.equals (button)) {
		showDucks () ;
		showFluffyUnicorns () ;
		showFrog() ;
	}
	

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}


}

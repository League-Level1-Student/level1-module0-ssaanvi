package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{  
	JButton button = new JButton();
	String realMessage = null ;
	public void showButton() {
	
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		System.out.println("Button clicked");
		int rand = new Random().nextInt(11);
	String x ="" + rand ;
String realMessage = null ;
	String message1= "Your hair will turn green." ; 
	String message2= "You will get verbally roasted within the period of one day." ; 
	String message3= "You will have a very profitable job when you grow up." ; 
	String message4= "Your will become rich." ; 
	String message5= "Your hair will turn bright pink." ; 
	String message6= "You will get a pet." ; 
	String message7= "You will have bad luck for a whole week." ; 
	String message8= "You will have good luck for a whole week." ; 
	String message9= "After a good thing happens to you, a bad thing will happen." ; 
	String message10= "You will find a lizard in your hair." ; 
	
	if (rand==1) {
	realMessage= message1;
	}
	if (rand==2) {
		realMessage= message2;
		}
	if (rand==3) {
		realMessage= message3;
		}
	if (rand==4) {
		realMessage= message4;
		}
	if (rand==5) {
		realMessage= message5;
		}
	if (rand==6) {
		realMessage= message6;
		}
	if (rand==7) {
		realMessage= message7;
		}
	if (rand==8) {
		realMessage= message8;
		}
	if (rand==9) {
		realMessage= message9;
		}
	if (rand==10) {
		realMessage= message10;
		}
	JButton buttonPressed = (button);
	
	if (buttonPressed.equals (button)) {
		JOptionPane.showMessageDialog(null, realMessage + " HOORAY"); }
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
	}
	









}
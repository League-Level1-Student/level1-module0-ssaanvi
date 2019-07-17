package jack_in_the_box;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox {
	static Dimension SMALL = new Dimension(200, 200);

public static void main(String[] args) {
	

	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	button.setLabel("Surprise");
	frame.add(button);
	frame.pack();
button.setPreferredSize(SMALL);
	System.out.println("Button clicked");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	


}

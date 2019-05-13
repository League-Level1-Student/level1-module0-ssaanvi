package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String pic = "https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwi5vNaR15niAhWP7Z8KHfXzDCYQjRx6BAgBEAU&url=http%3A%2F%2Fwww.litlepups.net%2Fe4dd41d4815084f3.html&psig=AOvVaw0Miem8yEGFKM0UCuV5uqdr&ust=1557877151607823";
		// 2. create a variable of type "Component" that will hold your image
Component c;
		// 3. use the "createImage()" method below to initialize your Component
c =createImage(pic);
		// 4. add the image to the quiz window
quizWindow.add(c);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String q1 =JOptionPane.showInputDialog("Do the cat and dog look cute together?");
		// 7. print "CORRECT" if the user gave the right answer
if (q1.equalsIgnoreCase("yes")) {
	System.out.println("CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
if (q1.equalsIgnoreCase("no")) {
	System.out.println("INCORRECT");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line
		// of code)
String pic2 = "https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwi_w9Kb2ZniAhVBCjQIHdzyDi4QjRx6BAgBEAU&url=https%3A%2F%2Fwww.facebook.com%2Fcutekittencat%2F&psig=AOvVaw3Q78izIsfO6j3hN8UPK0CV&ust=1557877775219932" ;
Component e;		
e =createImage(pic2);
// 11. add the second image to the quiz window
quizWindow.add(e);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String q2 =JOptionPane.showInputDialog("Is this cat hungry?");
		// 14+ check answer, say if correct or incorrect, etc.
if (q2.equalsIgnoreCase("yes")) {
	System.out.println("CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
if (q2.equalsIgnoreCase("no")) {
	System.out.println("INCORRECT");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

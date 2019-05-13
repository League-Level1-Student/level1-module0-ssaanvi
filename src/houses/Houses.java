package houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	static String small = "60";
	static String medium = "120";
	static String large = "250";
	static int x = Integer.parseInt(small);
	static int e = Integer.parseInt(medium);
	static int s = Integer.parseInt(large);

	public static void main(String[] args) {
		String color = JOptionPane
				.showInputDialog("Pick a color out of the following choices : Red, blue, green, orange, or pink.");
		if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.RED);
		}
		if (color.equalsIgnoreCase("orange")) {
			rob.setPenColor(Color.ORANGE);
		}
		if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.BLUE);
		}
		if (color.equalsIgnoreCase("pink")) {
			rob.setPenColor(Color.PINK);
		}
		if (color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.GREEN);
		}

		rob.moveTo(100, 500);
		rob.penDown();
		rob.setPenWidth(3);

		rob.setSpeed(9);
		Random r = new Random();
		drawFlatRoof();
		drawPointyRoof();
		rob.turn(270);
		drawFlatRoof();
		drawPointyRoof();
		rob.turn(270);
		drawFlatRoof();
		drawPointyRoof();
		rob.turn(270);
		drawFlatRoof();
		drawPointyRoof();
	}

	public static void drawFlatRoof() {

		rob.move(s);
		rob.turn(90);
		rob.move(x);
		rob.turn(90);
		rob.move(s);
		rob.turn(270);
		rob.move(30);
		rob.turn(270);
	}

	public static void drawPointyRoof() {
		rob.turn(360);
		rob.move(122);
		rob.turn(70);
		rob.move(37);
		rob.turn(50);
		rob.move(37);
		rob.turn(60);
		rob.move(122);
		rob.turn(270);
		rob.move(30);
	}
}

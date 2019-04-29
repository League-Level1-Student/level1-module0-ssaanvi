package houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
	
	
	Robot rob = new Robot () ;
	
	rob.moveTo(100, 500);
	rob.penDown();
	rob.setPenWidth(5);
	rob.setRandomPenColor();
	rob.setSpeed(9);
	rob.move(100);
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
	rob.move(100);
	rob.turn(270);
	rob.move(30);
	
	
}
}

package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot bot = new Robot(); 
		int speed = 30;
		int turnRadius = 90;
		bot.setSpeed(speed);
		bot.penDown();
		
		for (int i = 0; i < 4; i++) {
			bot.move(100); 
			bot.turn(turnRadius);
		}
		
		
		
	}
}

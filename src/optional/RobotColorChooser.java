package optional;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		Robot robot = new Robot();

		for (int i = 0; i < 10; i++) {

			// 3. ask the user what color they would like the tortoise to draw
			String color = JOptionPane.showInputDialog("What color would you like the tortoise to draw?");
			// String colorUpCase = color.toUpperCase();
			// robot.setPenColor(Color.getColor(colorUpCase));

			// 4. use an if/else statement to set the pen color that the user requested
			// 5. if the user does not enter anything, choose a random color
			if (color.equalsIgnoreCase("red")) {
				robot.setPenColor(Color.RED);
			} else if (color.equalsIgnoreCase("blue")) {
				robot.setPenColor(Color.BLUE);
			} else if (color.equalsIgnoreCase("black")) {
				robot.setPenColor(Color.BLACK);
			} else if (color.equalsIgnoreCase("white")) {
				robot.setPenColor(Color.WHITE);
			} else if (color.equalsIgnoreCase("yellow")) {
				robot.setPenColor(Color.YELLOW);
			} else if (color.equalsIgnoreCase("green")) {
				robot.setPenColor(Color.GREEN);
			} else if (color.equalsIgnoreCase("orange")) {
				robot.setPenColor(Color.ORANGE);
			} else if (color.equalsIgnoreCase("pink")) {
				robot.setPenColor(Color.PINK);
			} else if (color.equalsIgnoreCase("gray")) {
				robot.setPenColor(Color.GRAY);
			} else {
				robot.setRandomPenColor();
			}

			// 2. set the pen width to 10
			robot.setPenWidth(10);

			// 1. make the robot draw a shape (this will take more than one line of code)
			robot.penDown();
			robot.setSpeed(20);
			for (int j = 0; j < 3; j++) {
				robot.turn(360 / 3);
				robot.move(200);

			}
			robot.turn(36);

		}

	}

	// 6. put a loop around your code so that you keep asking the user for more
	// colors & drawing them

}

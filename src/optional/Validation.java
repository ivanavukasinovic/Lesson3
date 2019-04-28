package optional;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
			int randomNumber = new Random().nextInt(5);
			// 2. On paper, write all the numbers that get printed when you run this class
			System.out.println(randomNumber);

			// 3. Use the randomNumber to give the user a random compliment.
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "You’re really something special.");
			}
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "You are making a difference.");
			}
			if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "You’re a gift to those around you.");
			}
			if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "I love your enthusiasm.");
			}
			if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "Everything would be better if more people were like you.");
			}
		}
		// 4. Repeat all the code above 10 times

		// 5. Find someone to test out your program. They will like it :)
	}
}

package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {

		int random = new Random().nextInt(100) + 1;

		//System.out.println(random);

		for (int i = 4; i >= 0; i--) {

			String numberAsString = JOptionPane.showInputDialog("Guess a number between 1 and 100!");
			int numberAsInt = Integer.parseInt(numberAsString);

			if (numberAsInt > 0 && numberAsInt <= 100) {

				if (numberAsInt == random) {
					JOptionPane.showMessageDialog(null, "Congratulations! You guessed the secret number.");
					System.exit(0);

				} else if (numberAsInt > random) {
					if (i != 0) {
						JOptionPane.showMessageDialog(null, numberAsInt + " is too high, " + i + " more tries.");
					} else {
						JOptionPane.showMessageDialog(null, numberAsInt + " is too high. That was your last try.");
					}

				} else {
					if (i != 0) {
						JOptionPane.showMessageDialog(null, numberAsInt + " is too low, " + i + " more tries.");
					} else {
						JOptionPane.showMessageDialog(null, numberAsInt + " is too low. That was your last try.");
					}
				}

			} else {
				JOptionPane.showMessageDialog(null,
						"Inadequate input, please enter a number between 1 and 100. You have " + i + " more tries.");
			}

		}

		JOptionPane.showMessageDialog(null, "You lose.");
		System.exit(0);
	}

}

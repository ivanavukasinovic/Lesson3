package optional;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer1 = JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		// 5. Otherwise, say "wrong" and tell them the answer
		if (answer1.equals("towel")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer is: towel.");
		}

		// 6. Add some more riddles

		String answer2 = JOptionPane.showInputDialog("What kind of room has no doors or windows?");

		if (answer2.equals("mushroom")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer is: mushroom.");
		}

		String answer3 = JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly?");

		if (answer3.equals("incorrectly")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer is: incorrectly.");
		}

		String answer4 = JOptionPane.showInputDialog("What invention lets you look right through a wall?");

		if (answer4.equals("window")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer is: window.");
		}

		String answer5 = JOptionPane.showInputDialog("What has a neck but no head?");

		if (answer5.equals("bottle")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer is: bottle.");
		}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is: " + score);

	}
}

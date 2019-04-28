package optional;

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */
		/*
		 * Print sleep in if it is a vacation or a weekend. If it is a weekday, print
		 * "get up lazy bones!". If it is a weekday, and we are on vacation, print sleep
		 * in.
		 */

		int answerWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		// System.out.println(answerWeekday);
		if (answerWeekday == 0) {
			isWeekday = true;
		} else {
			isWeekday = false;
		}

		int answerVacation = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "", JOptionPane.YES_NO_OPTION);
		if (answerVacation == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		}

		if (isVacation == true || isWeekday == false) {
			JOptionPane.showMessageDialog(null, "Sleep in.");
		} else if (isVacation == false || isWeekday == true) {
			JOptionPane.showMessageDialog(null, "Get up lazy bones!");
		} else if (isWeekday == true && isVacation == true) {
			JOptionPane.showMessageDialog(null, "Sleep in.");
		} 

	}
}

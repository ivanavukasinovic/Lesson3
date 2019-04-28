package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "March 24th";
		String dadsBirthday = "May 3th";
		String myBirthday = "February 11th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String answer = JOptionPane.showInputDialog("Which birthday do you want?");

		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, "You want to know when is " + answer + "'s birthday");

		// 4. if user asked for "mom"
		// print mom's birthday
		if (answer.equals("mom")) {
			JOptionPane.showMessageDialog(null, answer + "'s birthday is on " + momsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if (answer.equals("dad")) {
			JOptionPane.showMessageDialog(null, answer + "'s birthday is on " + dadsBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else if (answer.equals("ivana")) {
			JOptionPane.showMessageDialog(null, answer + "'s birthday is on " + myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}

	}
}

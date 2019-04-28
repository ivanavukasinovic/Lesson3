package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class SpeakAndSpell {

	public static void main(String[] args) {

		int score = 0;
		for (int i = 0; i < 3; i++) {

			speak("spell conscious");
			String answer1 = JOptionPane.showInputDialog("Enter the answer:");
			i++;
			if (answer1.equals("conscious")) {
				speak("correct");
				score++;
			} else {
				speak("wrong");
			}

			speak("spell fluorescent");
			String answer2 = JOptionPane.showInputDialog("Enter the answer:");
			i++;
			if (answer2.equals("fluorescent")) {
				speak("correct");
				score++;
			} else {
				speak("wrong");
			}

			speak("spell chocolate");
			String answer3 = JOptionPane.showInputDialog("Enter the answer:");
			i++;
			if (answer3.equals("chocolate")) {
				speak("correct");
				score++;
			} else {
				speak("wrong");
			}
		}

		speak("Your score is: " + score);
		JOptionPane.showMessageDialog(null, "Your score is: " + score);

	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}

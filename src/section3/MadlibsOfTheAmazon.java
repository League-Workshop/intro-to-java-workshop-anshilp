package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a paranha-infested river, here's how to do it...");
		
		String one = JOptionPane.showInputDialog("Enter an adjective");
		String two = JOptionPane.showInputDialog("Enter a type of liquid");
		String three = JOptionPane.showInputDialog("Enter a body part");
		String four = JOptionPane.showInputDialog("Enter a verb");
		String five = JOptionPane.showInputDialog("Enter a place");
		
		JOptionPane.showMessageDialog(null, "Piranhas are more " + one + " during the day, so cross the river at night. Piranhas are attracted to fresh " + two + " and will most likely take a bite out of your" + three + " if you " + four + " Whatever you do, if you have an open wound, try to find another way to get back to the " + five + ". Good luck!");
		
		
		
		// Get the user to enter an adjective

		// Get the user to enter a type of liquid

		// Get the user to enter a body part

		// Get the user to enter a verb

		// Get the user to enter a place

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}


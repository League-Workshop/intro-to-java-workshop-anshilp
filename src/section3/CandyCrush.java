package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String answer = JOptionPane.showInputDialog("Who don't you like?");
		
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + answer);
		
		String output = JOptionPane.showInputDialog("Who is your best friend?");
				
		JOptionPane.showMessageDialog(null, output + " is sweet as candy");		
				
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		//JOptionPane.showMessageDialog(null, "You totally have a crush on Java!");
		// 3. Ask the user for the name of their best friend

		// 4. Tell them their best friend is as sweet as candy

	} 
}




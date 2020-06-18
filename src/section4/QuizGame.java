package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		int score = 0;
		

		
	String one = JOptionPane.showInputDialog("What is the sun?");
		if (one.equalsIgnoreCase("a Star")){
			score=score+1;
			}
		JOptionPane.showMessageDialog(null, score);
		
	String two = JOptionPane.showInputDialog("What is the year?");
	if (two.equals("2020")) {
		score = score+1;
	}
	
	JOptionPane.showMessageDialog(null, score);
		
	String three = JOptionPane.showInputDialog("What year did the US join World War 2");
	if (three.equals("1918")) {
		score = score +1;
	}
	
	JOptionPane.showMessageDialog(null, score);
	
	String four = JOptionPane.showInputDialog("What is your name?");
	
	score = score+1; 

	JOptionPane.showMessageDialog(null, score);	

}

	
	
	
		// 1.  Create a variable to hold the user's score 
		
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}


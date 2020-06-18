package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		
		int playerHealth = 100;
		int dragonHealth = 100;
		int playerDamage = 0;
		int dragonDamage = 0;
		
	while(playerHealth>0 && dragonHealth>0) {
		String answer = JOptionPane.showInputDialog("Do you want to yell at the dragon, or kick the dragon");
		if (answer.equalsIgnoreCase("yell")) {
			int random = r.nextInt(11);
			random=-dragonHealth; 
			
		}

		
	}	
		
		
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		
		// 4. Create a variable to hold the damage the player's attack does each round
		
		// 5. Create a variable to hold the damage the dragon's attack does each round
		
		
		// 6.  Delete the slashes at the beginning of the next line.  
		//while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		
		// 9. If they typed in "yell":
		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		
		 Random r = new Random();
		 int random =  r.nextInt(4); // Anything between 0 to 3, excluding 4.
	
		
		 JOptionPane.showMessageDialog(null, random);
		 JOptionPane.showInputDialog("What is something you think is awesome?");
		 
		 if(random==0) {
			 JOptionPane.showMessageDialog(null, "That's Awesome!");
		 }
		 
		 if(random==1)	{ 
			 JOptionPane.showMessageDialog(null, "That's okay.");
		 }
		 
		 if(random==2)	{
			 JOptionPane.showMessageDialog(null, "That's boring!");
		 }
		 
		 if(random==3)	{
			 JOptionPane.showMessageDialog(null, "Cool!");
		 }
		 
		 
		 
		// 3. Print out this variable
	
		// 4. Get the user to enter something that they think is awesome
	
		// 5. If the random number is 0
		
	
	
		// -- tell the user whatever they entered is awesome!
	
		// 6. If the random number is 1
	
		// -- tell the user whatever they entered is ok.
	
		// 7. If the random number is 2
	
		// -- tell the user whatever they entered is boring.
	
		// 8. If the random number is 3
	
		// -- write your own answer
	}
	}


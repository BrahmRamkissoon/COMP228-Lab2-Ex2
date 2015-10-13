package com.ramkissoon.brahm;

import javax.swing.JOptionPane;

/**
 * 
 * Class: DieTest.java
 * @author Brahmadut Ramkissoon
 * Oct 13, 2015
 */
public class DieTest {
	
	public static final int MAX_ROLLS = 3;
		
	public static void main(String[] args) {
		int userGuess;
		int userRoll = 1;
		int diceAppValue = totalDiceValue();;
		boolean hint = false;
		
		// Check for appropriate guess between 2 and 12
		while(true){
			String input = JOptionPane.showInputDialog("Please enter a guess between 2 and 12:");
			userGuess = Integer.parseInt(input);			
			if (userGuess >= 2 && userGuess <= 12){				
				break;
			}//if			
		}//while		
		 
		
		for (int i = 0; i < MAX_ROLLS; i++) {
			if (userGuess == diceAppValue) {
				// User wins
				JOptionPane.showMessageDialog(null, "Correct Guess, you win!");	
				break;
			}
			else{				
				// Accept user input 
				String tryAgain = JOptionPane.showInputDialog("This is roll number " + ++userRoll + ", \n\nTry again! "
															+ "\n Hint: " + ((userGuess>diceAppValue) ? "Guess Lower" : "Guess Higher"));
				userGuess = Integer.parseInt(tryAgain);
					// Game wins
					if(i++ == 2){
						JOptionPane.showMessageDialog(null, "The House wins!");
					}							
				}//else
			}//for
		}

	
	// Method to sum values of both die
	public static int totalDiceValue(){
		int diceOne = new Die().getSideValue();
		int diceTwo = new Die().getSideValue();
		int sum = (diceOne + diceTwo);
		return sum;			
	}
}

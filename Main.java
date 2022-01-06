package com.claudinebustillo;

import java.util.Scanner;
/**
 * THIS PROGRAM IS CALLED HANGMAN, A GAME PLAYED BY ATLEAST TWO PLAYERS WHERE THE PLAYER 1 WILL GIVE THE WORD
 * PLAYER 2 WILL GUESS THE WORD BY ENTERING A LETTER
 * THIS PROGRAM CHECKS IF THE LETTER IS FOUND IN THE GIVEN WORD
 * PLAYER 2 IS ONLY GIVEN 6 TRIES TO GUESS THE WORD. 
 * @author CLAUDINE BUSTILLO
 *
 */
public class Main {
	public static void main(String [] args) {
		var message= new Mssg();									//gets the function from other class
		message.introduction();										//calls out introduction function from message class
		Scanner input= new Scanner(System.in);
		System.out.println("Player 1, enter word here:");
		String word= input.nextLine();								//transforms strings into characters
		char[] textArray= word.toCharArray();
		message.start();
		
		Blanks blank= new Blanks ();
		blank.fillers(word);
		
		
		char[] answers= new char[textArray.length];
		
		for (int i= 0; i<textArray.length; i++) {
			answers[i]='-';
		}
		
		/**
		 * Start of the game
		 */
		boolean finish= false;
		while(finish==false) { 
			
			message.enterAnswer();
			Scanner answer= new Scanner(System.in);
			String letter=answer.nextLine();
			
			/**
			 * checks if the input answer is valid
			 */
			while(letter.length()!=1||Character.isDigit(letter.charAt(0))) {
				message.wrongInput();
				letter=input.next();
			}
			/**
			 * checks if the letter input is found in the given word.
			 */
			boolean victory= false;
			int life=6;
			
			for (int i=0; i<textArray.length;i++) {
				if (letter.charAt(0)== textArray[i]) {
					answers[i]=textArray[i];
					victory= true;
				}
			}
			/**
			 * the player only has 6 tries, every wrong answer will be deducted to its life. 
			 */
			
			if (!victory) {
				life-=1;
				
				message.wrongAnswer();
			}
			/**
			 * checks for the right answer
			 */
			boolean done=true;
			
			for (int i=0;i<answers.length;i++) {
				if(answers[i]=='-') {
					System.out.print(" -");
					done=false;
				}
				
				else {
					System.out.print(" "+answers[i]);
				}
				
			}
			System.out.println("\nLives left:"+ life);

			/**
			 * the program stops if the user has found the right answer
			 */
			
			if (done) {
				message.rightAnswer();
				finish=true;
				
			}
			/**
			 * the program stops when user has reached maximum tries
			 */
			
			if (life<=0) {
				message.wrongAnswer();
				finish=true;
			}
		}
	}		
}

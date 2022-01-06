package com.claudinebustillo;
/**
 * 
 * @author CLAUDINE BUSTIILO
 * this includes messages that will be printed out, depending on the message it wants to convey
 */
public class Message {
	public void introduction() {
		System.out.println("\nWelcome to HANGMAN, this game is played by atleast two players\nFirst player will set the word to be guessed.");
		System.out.println("*********************************************************************************\n");
	}
	
	public void start() {
		System.out.println("Player 2, guess the word(s):");
	}
	
	public void wrongInput() {
		System.out.println("ERROR INPUT, try again. ");
	}
	
	public void wrongAnswer() {
		System.out.println("Uh oh, that letter is not in this word. ");
	}
	
	public void rightAnswer() {
		System.out.println("Yey! You got the right Answer! ");
	}
	
	public void enterAnswer() {
		System.out.println("Enter a letter:");
	}
	
	public void repeatAnswer() {
		System.out.println("Try another letter!");
	}
	
	public void gameOver() {
		System.out.println("GAME OVER!");
	}
	
	public void playAgain() {
			System.out.println("Play Again?/npress y for yes/npress n for no");
	}
}

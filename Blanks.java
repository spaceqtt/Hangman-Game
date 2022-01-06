package com.claudinebustillo;
/**
 * 
 * @author CLAUDINE BUSTILLO
 * this determines the length of the given word, this gives a hint to the other player on how many letters there is.
 *
 */
public class Blanks {
	/**
	 * this method takes in the given word and replace each letter with "-"
	 * @param word
	 */
	public void fillers (String word) {		
		StringBuilder sbWord= new StringBuilder(word);
		
		for(int i=0; i<sbWord.length();i++)
		{
				sbWord.replace(i, i+1, "-");

        }
		
		System.out.println(sbWord);
	}
}

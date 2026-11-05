/*
 
Program: CountVowel.java     Last Date of this Revision: October 25th, 2026

Purpose: Create an application that prompts the user for a string and then displays a count of the number of vowels in the string.

*/

package Mastery;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		
	//prompt user to enter text
		System.out.print("Enter text: ");
		String text= input.nextLine();
		
	//get the counter for vowels
		int vowelCount = 0;
		
	//Convert the string to lowercase to make checking vowels easier
		String lowerText = text.toLowerCase();
		
	//Loop through each character in the string
		for (int i=0; i < lowerText.length(); i++) {
			char ch = lowerText.charAt(i);
			
	//Check if the current character is a vowel
			if (ch =='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u') {
				vowelCount++; //Increment the counter if it's a vowel
			}
		}
		
		//Display the final output matching the textbook example
		System.out.println("The number of vowels in: -" + text + "- is: " + vowelCount + ".");
	}

}


/*Screen Dump

--- Test Case 1 ---
Enter text: My name is anaya
The number of vowels in: -My name is anaya- is: 6.

--- Test Case 2: Only Vowels ---
Enter text: aeiou
The number of vowels in: -aeiou- is: 5.

--- Test Case 3: No Vowels ---
Enter text: rthw
The number of vowels in: -rthw- is: 0.

*/

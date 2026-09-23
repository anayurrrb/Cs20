/*

Program: RandomNum.java          Last Date of this Revision: September 21, 2026

Purpose: An application that takes users min and max number before spitting out a random number between that limit

*/



/* Screen Dump
 
Paste the output of your code here
 
 */
package SkillBuilders;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) 
	{
		//Declare the min and max variables
		int min, max;
		
		//introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the min number
		System.out.println("Enter the min number: ");
		
		//Record the min number
		min = input.nextInt();
		
		//Prompt the user for the max number
		System.out.println("Enter the max number: ");
				
		//Record the max number
		max = input.nextInt();
		
		//Generate the random numbers
		System.out.println("Random number: "+ (int)((max - min + 1) * Math.random() + min ));
									//0.0 - 1.0
		
		
		
		
	}

}

/*Screen Dump

Enter the min number: 
7
Enter the max number: 
14
Random number: 13


Enter the min number: 
9
Enter the max number: 
30
Random number: 12




*/
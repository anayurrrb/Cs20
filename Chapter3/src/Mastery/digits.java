/*
 
Program: digits.java       Last Date of this Revision: September 29, 2026

Purpose:  modifying the digits application in skill builder to show the hundreds place digit of a three digit number

*/

package Mastery;

import java.util.Scanner;

public class digits {

	public static void main(String[] args)
	{

		int digit;
		int hundreds;
		int tens;
		int ones;
		
			//change prompt text to aks for 3 digit number
			Scanner userinput = new Scanner (System.in);
			
			System.out.println ("type in your three digit number: ");
			
			digit = userinput.nextInt();
			
			System.out.println("your three digit number: " + digit);
			
			//update the math operation
			hundreds = (digit / 100);
			tens = (digit % 100) / 10;
			ones = (digit % 10);
			
			//print all three values
			System.out.println("The hundreds place of your three digit number is: " + hundreds);
			System.out.println("The tens place of your three digit number is: " + tens);
			System.out.println("The ones place of your three digit number is: " + ones);
	}

}


/*Screen Dump

type in your three digit number: 
765
your three digit number: 765
The hundreds place of your three digit number is: 7
The tens place of your three digit number is: 6
The ones place of your three digit number is: 5


type in your three digit number: 
902
your three digit number: 902
The hundreds place of your three digit number is: 9
The tens place of your three digit number is: 0
The ones place of your three digit number is: 2

*/
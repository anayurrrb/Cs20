/*
 
Program: Change.java       Last Date of this Revision: October 2, 2026

Purpose:  create a change application that prompts the user for an amount less than $1.00 and then displays the minimum number of coins necessary to make the change.

*/

package Mastery;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a Scanner object to take input from user
		Scanner scanner = new Scanner(System.in);
		
		//prompt use for input
		System.out.print("enter the change in cents: ");
		int money = scanner.nextInt();
		
		
		//calculate min number of coins
		int quarters = money / 25; 
		money %= 25;
		
		int dimes = money / 10;
		money %= 10;
		
		int nickels = money / 5;
		money %= 5;
		
		int pennies = money;
		
		//display the result
		System.out.println("The minimum number of coins is: ");
		System.out.println("quarters: " + quarters);
		System.out.println("dimes: " + dimes);
		System.out.println("nickels: " + nickels);
		System.out.println("pennies: " + pennies);

		
		
	}

}

/*Screen Dump

enter the change in cents: 674
The minimum number of coins is: 
quarters: 26
dimes: 2
nickels: 0
pennies: 4

enter the change in cents: 78
The minimum number of coins is: 
quarters: 3
dimes: 0
nickels: 0
pennies: 3


*/

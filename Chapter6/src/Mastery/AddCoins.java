/*
 
Program: AddCoins.java     Last Date of this Revision: October November 3rd, 2026

Purpose: Create an application that prompts the user for the number of pennies, nickels, dimes, and quarters, and then displays their total dollar amount

*/

package Mastery;

import java.util.Scanner;

public class AddCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		// Get coin counts from the user
		System.out.print("Enter quarters: ");
		int quarters = input.nextInt();

		System.out.print("Enter dimes: ");
		int dimes = input.nextInt();

		System.out.print("Enter nickels: ");
		int nickels = input.nextInt();

		System.out.print("Enter pennies: ");
		int pennies = input.nextInt();

		// Calculate total value
		double total = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);

		// Print final total using %.2f formatting for 2 decimal places
		System.out.printf("\nTotal: $%.2f\n", total);

		        input.close();

	}

}

/*Screen Dump

--- Test Case 1 --- mixed coins
Enter quarters: 2
Enter dimes: 3
Enter nickels: 1
Enter pennies: 4

Total: $0.89

--- Test Case 2--- no coins
Enter quarters: 0
Enter dimes: 0
Enter nickels: 0
Enter pennies: 0

Total: $0.00

--- Test Case 3--- exactly one dollar
Enter quarters: 4
Enter dimes: 0
Enter nickels: 0
Enter pennies: 0

Total: $1.00


*/

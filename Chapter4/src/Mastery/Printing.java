/*
 
Program: Printing.Java      Last Date of this Revision: October 8, 2026

Purpose:  Create a printing application that prompts the user for the number of copes to print and then displays the price per copy and the total price  for the job

*/

package Mastery;

import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int copies;
		double pricePerCopy = 0.0;
		double totalCost;
		
		//Prompt user for the number of copies
		System.out.print("Enter the number of copies to be printed: ");
		copies = input.nextInt();
		
		//Determine price per copy based on quantity
		if(copies >= 0 && copies <=99) {
			pricePerCopy = 0.30;
		} else if (copies>=100 && copies <=499) {
			pricePerCopy=0.28;
		} else if (copies>=500 && copies <=749) {
			pricePerCopy=0.27;
		} else if (copies>=750 && copies <=1000) {
			pricePerCopy=0.26;
		} else if (copies>1000) {
			pricePerCopy=0.25;
		}
		
		//Calculate total cost
		totalCost = copies * pricePerCopy;
		
		//display results
		System.out.println("Price per copy is: $" + pricePerCopy);
		System.out.println("Total cost is: $" + totalCost);
	}

}

/*Screen Dump

Enter the number of copies to be printed: 1001
Price per copy is: $0.25
Total cost is: $250.25


Enter the number of copies to be printed: 678
Price per copy is: $0.27
Total cost is: $183.06


*/

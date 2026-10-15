/*
 
Program: Grade.java       Last Date of this Revision: October 2, 2026

Purpose:  

*/
package Mastery;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int percentage;
		
		//prompt user for the percentage they got
		System.out.print("Enter the percentage: ");
		percentage = input.nextInt();
		
		//determine the corresponding letter grade
		System.out.print("The corresponding letter grade is: ");
		
		if(percentage >= 90 && percentage <= 100) {
			System.out.println("A");
		}else if(percentage >= 80 && percentage <= 89) {
			System.out.println("B");
		}else if(percentage >= 70 && percentage <= 79) {
			System.out.println("C");
		}else if (percentage >= 60 && percentage <= 69) {
			System.out.println("D");
		}else { 
			System.out.println("F");

				
		}
	}

}

/*Screen Dump

--- Test Case 1: Excellent Grade (A) ---
Enter the percentage: 95
The corresponding letter grade is: A

--- Test Case 2: Average Grade (C) ---
Enter the percentage: 74
The corresponding letter grade is: C

--- Test Case 2: Failing Grade (F) ---
Enter the percentage: 35
The corresponding letter grade is: F

*/

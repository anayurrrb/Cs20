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
		char letterGrade;
		
		//prompt user for the percentage
		System.out.print("Enter the percentage: ");
		percentage = input.nextInt();
		
		//determine the corresponding letter grade
		if(percentage >= 90 && percentage <= 100) {
			letterGrade = 'A';
		}else if(percentage >= 80 && percentage <= 89) {
			letterGrade = 'B';
		}else if(percentage >= 70 && percentage <= 79) {
			letterGrade = 'C';
		}else if (percentage >= 60 && percentage <= 69) {
			letterGrade = 'D';
		}else { 
			letterGrade = 'F';
			
		// Display the result
	    System.out.println("The corresponding letter grade is: " + letterGrade);

				
		}
	}

}

/*Screen Dump




*/

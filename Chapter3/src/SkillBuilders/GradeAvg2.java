package SkillBuilders;

import java.util.Scanner;

public class GradeAvg2 {

	public static void main(String[] args) 
	{
		//Create a Scanner object to take input from user
		Scanner in = new Scanner(System.in);
		
		//Create a variable to hold the running total sum
		double total = 0;
		
				
		//Prompt user to input first number
		System.out.print("Input first grade: ");
		double num1 = in.nextDouble();
		total += num1; //ad num1 to total
				
		//Prompt user to input the second number
		System.out.print("Input second grade: ");
		double num2 = in.nextDouble();
		total += num2; //add num2 to total
				
		//Prompt user to input third number
		System.out.print("Input third grade: ");
		double num3 = in.nextDouble();
		total += num3; //add num3 to total
				
		//Prompt user to input fourth number
		System.out.print("Input fourth grade: ");
		double num4 = in.nextDouble();
		total += num4; //add num4 to total
				
		//Prompt user to input fifth number
		System.out.print("Input fifth grade: ");
		double num5 = in.nextDouble();
		total += num5; //add num5 to total
				
		double average = total / 5;
		//Calculate the average shown neatly as percentage
		System.out.printf("Average of five numbers is: %.2f%%\n", average);
				
		
		
	}

}

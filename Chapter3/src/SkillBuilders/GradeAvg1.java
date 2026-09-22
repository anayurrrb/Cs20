package SkillBuilders;

import java.util.Scanner;

public class GradeAvg1 {

	public static void main(String[] args)
	{

		//Create a Scanner object to take input from user
		Scanner in = new Scanner(System.in);
		
		//Prompt user to input first number
		System.out.print("Input first grade: ");
		
		//Read and store first number
		int num1 = in.nextInt();
		
		//Prompt user to input the second number
		System.out.print("Input second grade: ");
		
		//Read and store second number
		int num2 = in.nextInt();
		
		//Prompt user to input third number
		System.out.print("Input third grade: ");
		
		//Read and store third number
		int num3 = in.nextInt();
		
		//Prompt user to input fourth number
		System.out.print("Input fourth grade: ");
		
		//Read and store fourth number
		int num4 = in.nextInt();
		
		//Prompt user to input fifth number
		System.out.print("Input fifth grade: ");
		
		//Read and store fifth number
		int num5 = in.nextInt();
		
		//Calculate and print the average of the five numbers
		System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);
		
		
	}

}

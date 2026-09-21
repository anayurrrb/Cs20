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

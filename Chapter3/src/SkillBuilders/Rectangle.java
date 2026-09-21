package SkillBuilders;

import java.util.Scanner;

public class Rectangle
{

	public static void main(String[] args) 
	{
		//Declare Variables
		int length;
		int width;
		int area;
		int perimeter;
		
		//Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask the user to enter the width
		System.out.print("Enter the width: ");
		
		//Get the width value from the user
		width = userinput.nextInt();
		
		//Ask the user to enter the length
		System.out.print("Enter the length: ");
		
		//Get the length value from the user
		length = userinput.nextInt();
		
		//Calculate the parameter
		
		//Display the width and length on the console
		System.out.println("The width is: " + width);
		
		System.out.println("The width is: " + length);
		
		//calculate the area
		area = length * width;
		
		//Display area on the screen
		System.out.println("Area = "+ area); 
		
		//calculate the perimeter
		perimeter = (2 * length + 2 * width);
		
		
		//Display the perimeter on the screen
		System.out.println("perimeter = "+ perimeter); 

		
	}

}

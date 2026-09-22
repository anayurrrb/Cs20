package SkillBuilders;

import java.util.Scanner;

public class digit {

	public static void main(String[] args) 
	{

	int digit;
	int tens;
	int ones;
	
	
		Scanner userinput = new Scanner (System.in);
		
		System.out.println ("type in your two digit number: ");
		
		digit = userinput.nextInt();
		
		System.out.println("your two digit number: " + digit);
		
		tens = (digit / 10);
		ones = (digit % 10);
		
		System.out.println("The tens place of your two digit number is: " + tens);
		System.out.println("The ones place of your two digit number is: " + ones);
		
		
		
	}

}

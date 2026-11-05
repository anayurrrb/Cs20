package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int max = input.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= max) {
			System.out.println(i);
			sum += i;
			i++;			
		}
		
		System.out.println("The sum is: " + sum);
	}

}

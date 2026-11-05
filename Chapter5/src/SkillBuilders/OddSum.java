package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int max = input.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= max) {
			if (i % 2!= 0) {
				sum += i;
			
			}
			i++;
		}
		System.out.println("The sum of odd numbers is: " + sum);
		
	}

}

package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a Scanner object to take input from user
				int number;
				Scanner userinput = new Scanner(System.in);
				
				System.out.print("Enter an integer: ");
				if (userinput.hasNextInt()) {
					
					number = userinput.nextInt();
					
					if (number < 0) {
						System.out.println(number + "is not a perfect square because it is negative.");
					} else {
						double squareRoot = Math.sqrt(number);
						int truncated = (int) squareRoot;
						int squared = truncated * truncated;
						
						if (squared == number) {
							System.out.println(number + "is a perfect square.");
						} else {
							System.out.println(number + "is not a perfect square");
						}
						
					}
				} else {
					System.out.println("Invalid input. please enter a valid integer.");
						
				
				}

				

	}

}

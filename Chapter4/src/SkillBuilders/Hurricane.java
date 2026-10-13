package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int category;
		
		//Get user input
		System.out.print("Enter hurricane category (1-5): " );
		category = input.nextInt();
		
		
		//Display hurricane wind speeds based on category entered
		switch (category) {
		case 1:
			System.out.println("Wind speed: 74-95 mph, 64-82 kt, or 119-153 km/hr");
			break;
		case 2:
			System.out.println("Wind speed: 96-110 mph, 83-95 kt, or 154-177 km/hr");
			break;
		case 3:
			System.out.println("Wind speed: 131-155 mph, 114-135 kt, or 210-249 km/hr");
			break;
		case 4:
			System.out.println("Wind speed: 131-155 mph, 114-135 kt, or 210-249 km/hr");
			break;
		case 5:
			System.out.println("Wind speed: Greater than 155 mph, 135 kt, or 249 km/hr");
			break;

		}
	}

}

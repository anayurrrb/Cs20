/*
 
Program: GroupAssignment.java     Last Date of this Revision: October 27th, 2026

Purpose: Create and application that prompts the user for his or her name and then displays a group assignment. The group assignment depends on the first letter of the students last name.

*/

package Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create a Scanner object for keyboard input
        Scanner input = new Scanner(System.in);
        
        // Ask for first name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        // Ask for last name
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        int groupNumber = 0;
        
        // make sure last name is not empty before checking its characters
        if (lastName.length() > 0) {
            // Get the first letter of the last name and capitalize it for comparison
            char firstLetter = Character.toUpperCase(lastName.charAt(0));
            
            // Determine group based on alphabetical ranges given in the textbook
            if (firstLetter >= 'A' && firstLetter <= 'I') {
                groupNumber = 1;
            } 
            else if (firstLetter >= 'J' && firstLetter <= 'S') {
                groupNumber = 2;
            } 
            else if (firstLetter >= 'T' && firstLetter <= 'Z') {
                groupNumber = 3;
            }
        }
        
        // Display the result matching the required output format
        if (groupNumber > 0) {
            System.out.println(firstName + " " + lastName + " is assigned to Group " + groupNumber);
        }
        
    
    }
}


/*Screen Dump

--- Test Case 1: (A-I) ---
Enter your first name: Anaya
Enter your last name: Batool
Anaya Batool is assigned to Group 1

--- Test Case 2: (J-S) ---
Enter your first name: John
Enter your last name: Smith
John Smith is assigned to Group 2

--- Test Case 3: (T-Z) ---
Enter your first name: Samantha
Enter your last name: Wu
Samanthu Wu is assigned to Group 3

*/




/*
 
Program: GuessingGame.java     Last Date of this Revision: October November 3rd, 2026

Purpose: Create an application that prompts the user to guess the number chosen by system, whilst giving hints until user wins the guessing game

*/

package Mastery;

import java.util.Scanner;

public class GuessingGame {

    // Helper method that receives the user's guess and secret number then it prints a hint
    public static void giveHint(int userGuess, int secretNum) {
        if (userGuess < secretNum) {
            System.out.println("Hint: try a higher number");
        } else if (userGuess > secretNum) {
            System.out.println("Hint: try a lower number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Set secret target number
        int secret = 4;
        int userGuess = 0;

        // Loop until user gets the right number
        while (userGuess != secret) {
            System.out.print("Enter a number between 1 and 20: ");
            userGuess = input.nextInt();

            // If incorrect call method to display hint otherwise display win message
            if (userGuess != secret) {
                giveHint(userGuess, secret);
            } else {
                System.out.println("You won!");
            }
        }
    }
}
//
/*Screen Dump

--- Test Case 1 --- mixed coins
Enter a number between 1 and 20: 3
Hint: try a higher number
Enter a number between 1 and 20: 14
Hint: try a lower number
Enter a number between 1 and 20: 12
Hint: try a lower number
Enter a number between 1 and 20: 10
Hint: try a lower number
Enter a number between 1 and 20: 11
Hint: try a lower number
Enter a number between 1 and 20: 9
Hint: try a lower number
Enter a number between 1 and 20: 5
Hint: try a lower number
Enter a number between 1 and 20: 2
Hint: try a higher number
Enter a number between 1 and 20: 4
You won!

--- Test Case 2--- 
Enter a number between 1 and 20: 15
Hint: try a lower number
Enter a number between 1 and 20: 12
Hint: try a lower number
Enter a number between 1 and 20: 10
Hint: try a lower number
Enter a number between 1 and 20: 4
You won!

--- Test Case 3---
Enter a number between 1 and 20: 18
Hint: try a lower number
Enter a number between 1 and 20: 10
Hint: try a lower number
Enter a number between 1 and 20: 5
Hint: try a lower number
Enter a number between 1 and 20: 2
Hint: try a higher number
Enter a number between 1 and 20: 3
Hint: try a higher number
Enter a number between 1 and 20: 4
You won!



*/
package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {

    public static void hoursToMinutes() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours: ");
        double hours = input.nextDouble();
        System.out.println(hours + " hours = " + (hours * 60) + " minutes.");
    }

    public static void daysToHours() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter days: ");
        double days = input.nextDouble();
        System.out.println(days + " days = " + (days * 24) + " hours.");
    }

    public static void minutesToHours() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        double minutes = input.nextDouble();
        System.out.println(minutes + " minutes = " + (minutes / 60) + " hours.");
    }

    public static void hoursToDays() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours: ");
        double hours = input.nextDouble();
        System.out.println(hours + " hours = " + (hours / 24) + " days.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            hoursToMinutes();
        } else if (choice == 2) {
            daysToHours();
        } else if (choice == 3) {
            minutesToHours();
        } else if (choice == 4) {
            hoursToDays();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}


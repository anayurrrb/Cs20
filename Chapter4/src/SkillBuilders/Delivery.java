package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
	
		 // open the scanner
        Scanner in = new Scanner(System.in);
        
        // get user input
        System.out.print("Input length of package: ");
        double length = in.nextDouble();
        
        System.out.print("Input width of package: ");
        double width = in.nextDouble();
        
        System.out.print("Input height of package: ");
        double height = in.nextDouble();
        
        // Print individual evaluation for each dimension
        System.out.println("Length status: " + getCategory(length));
        System.out.println("Width status: " + getCategory1(width));
        System.out.println("Height status: " + getCategory2(height));
        
       
    }

    // individual length check
    public static String getCategory(double length) {
        if (length <= 10) {
            return "Accept";
        } else {
            return "Reject";
        }
    }

    // individual width check
    public static String getCategory1(double width) {
        if (width <= 10) {
            return "Accept";
        } else {
            return "Reject";
        }
    }

    // individual height check
    public static String getCategory2(double height) {
        if (height <= 10) {
            return "Accept";
        } else {
            return "Reject";
        }
    }

}

package Patterns;

import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the diamond pattern: ");
        int rows = sc.nextInt(); // Read the number of rows from user input

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = rows; j > i; j--) { // Print leading spaces
                System.out.print(" "); // Print a space
            }
            for (int j = 1; j <= (2 * i - 1); j++) { // Print stars in each row
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after each row
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) { // Loop through each row in reverse order
            for (int j = rows; j > i; j--) { // Print leading spaces
                System.out.print(" "); // Print a space
            }
            for (int j = 1; j <= (2 * i - 1); j++) { // Print stars in each row
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}

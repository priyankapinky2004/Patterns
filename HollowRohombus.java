package Patterns;

import java.util.*;

public class HollowRohombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the hollow rhombus: ");
        int rows = sc.nextInt(); // Read the number of rows from user input
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows - i; j++) { // Print leading spaces
                System.out.print(" "); // Print a space
            }
            for (int j = 1; j <= rows; j++) { // Loop to print stars and spaces in each row
                if (j == 1 || j == rows || i == 1 || i == rows) { // Check if it's the first or last row or column
                    System.out.print("*"); // Print a star
                } else {
                    System.out.print(" "); // Print a space for hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

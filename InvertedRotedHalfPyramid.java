package Patterns;

import java.util.*;

public class InvertedRotedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the inverted rotated half pyramid: ");
        int rows = sc.nextInt(); // Read the number of rows from user input
        for (int i = 0; i < rows; i++) { // Loop through each row
            for (int j = 0; j < rows - i; j++) { // Loop to print spaces before stars
                System.out.print(" "); // Print a space
            }
            for (int j = 0; j <= i; j++) { // Loop to print stars in each row
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

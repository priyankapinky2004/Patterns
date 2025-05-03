package Patterns;

import java.util.*;

public class INVERTEDHALF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the inverted half pyramid: ");
        int rows = sc.nextInt(); // Read the number of rows from user input
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows - i; j++) { // Loop to print numbers in each row
                System.out.print(j + " "); // Print the current column number followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

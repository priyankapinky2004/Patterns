package Patterns;

import java.util.*;

public class CharPAttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the character pattern: ");
        int rows = sc.nextInt(); // Read the number of rows from user input
        char ch = 'A'; // Initialize the starting character
        for (int i = 0; i < rows; i++) { // Loop through each row
            for (int j = 0; j <= i; j++) { // Loop to print characters in each row
                System.out.print(ch + " "); // Print the current character followed by a space
                ch++; // Move to the next character
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

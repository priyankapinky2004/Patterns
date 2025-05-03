package Patterns;
import java.util.*;
public class SolidRohombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the solid rhombus: ");
        int rows = sc.nextInt(); // Read the number of rows from user input
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows - i; j++) { // Loop to print leading spaces
                System.out.print(" "); // Print a space
            }
            for (int j = 1; j <= rows; j++) { // Loop to print stars in each row
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

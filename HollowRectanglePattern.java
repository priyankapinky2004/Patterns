package Patterns;
import java.util.*;
public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the hollow rectangle: ");
        int rows = sc.nextInt(); // Read the number of rows from user input
        System.out.println("Enter the number of columns for the hollow rectangle: ");
        int cols = sc.nextInt(); // Read the number of columns from user input

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= cols; j++) { // Loop through each column
                if (i == 1 || i == rows || j == 1 || j == cols) { // Check if it's a border cell
                    System.out.print("* "); // Print a star for border cells
                } else {
                    System.out.print("  "); // Print spaces for inner cells
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

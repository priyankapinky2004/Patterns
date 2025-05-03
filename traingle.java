package Patterns;

import java.util.*;

public class traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the triangle: ");
        int rows = sc.nextInt(); // Read the number of rows from user input
        for (int i = 0; i <= rows - 1; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop to print stars in each row
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close();
    }
}

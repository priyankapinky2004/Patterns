package Patterns;

import java.util.Scanner;

public class Zeroand1Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows : ");// Number of rows for 0-1 Triangle
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); // Read the number of rows from user input

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { // Check if the sum of row and column indices is even
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

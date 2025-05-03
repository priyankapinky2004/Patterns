package Patterns;

import java.util.Scanner;

public class palindromicPatternWithNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows : ");// Number of rows for Palindromic Pattern
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); // Read the number of rows from user input

        for (int i = 1; i <= rows; i++) {
            int number = i;
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = 1; j < i; j++) {
                System.out.print(number-- + " ");
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
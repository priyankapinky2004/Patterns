package Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows : ");// Number of rows for Floyd's Triangle
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); // Read the number of rows from user input
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
package Patterns;

import java.util.*;

public class HAlfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the half pyramid: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " "); // Print the current column number followed by a space
            }
            System.out.println();
        }
        sc.close();
    }
}

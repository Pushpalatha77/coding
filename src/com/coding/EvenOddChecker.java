package com.coding;
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

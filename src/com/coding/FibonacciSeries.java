package com.coding;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();
        
        // Generate and print the Fibonacci series
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < numTerms; i++) {
            int fibNumber = fibonacci(i);
            System.out.print(fibNumber + " ");
        }
        
        scanner.close();
    }
    
    // Function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


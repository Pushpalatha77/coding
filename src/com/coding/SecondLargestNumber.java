package com.coding;
import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int secondLargest = findSecondLargest(inputArray);
        System.out.println("The second largest number is: " + secondLargest);
        scanner.close();
    }
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements.");
        }

        // Sort the array in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // The second largest number will be at index 1
        return arr[1];
    }
}

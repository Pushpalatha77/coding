package com.coding;
import java.util.Arrays;
import java.util.Scanner;
public class AlphabeticAscending {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int count = scanner.nextInt();
        String[] inputArray = new String[count];
        System.out.println("Enter the strings:");
        for (int i = 0; i < count; i++) {
            inputArray[i] = scanner.next();
        }
        String[] sortedArray = sortArrayAsc(inputArray);
        System.out.println("Sorted Array :" + Arrays.toString(sortedArray));
        scanner.close();
    }

    public static String[] sortArrayAsc(String[] arr) {
        String[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}

package com.coding;

public class Occurence {
    public static int countOccurrences(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Hello";
        char target = 'l';
        int occurrenceCount = countOccurrences(input, target);
        System.out.println(" Occurence Of '" + target + "' is " + occurrenceCount + " times in the input string.");
    }
}

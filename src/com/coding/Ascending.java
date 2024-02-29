package com.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        List<Integer> inputList = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            inputList.add(scanner.nextInt());
        }

        List<Integer> sortedList = sortListAsc(inputList);

        System.out.println("Sorted List (Ascending Order): " + sortedList);

        scanner.close();
    }

    public static List<Integer> sortListAsc(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }
}



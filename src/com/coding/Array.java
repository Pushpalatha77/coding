package com.coding;
import java.util.Scanner;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements of array:" );
		int size= sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the  Elements of array:" );		
	   for (int i =0; i<size;i++) {
		   arr[i] = sc.nextInt();
		   		   
	   }
	   Arrays.sort(arr);
	   int max = arr[size - 3];
	   System.out.println("Third largest element:" + max);
	   sc.close();
	 }

}

package com.coding;
import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of times to print:" );
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    System.out.println();
	    for(int i=1; i <=n; i++) {
	    	System.out.println("HelloWorld" + " " + i);
	    }
	}

}

package com.coding;

import java.util.Scanner;

public class Stdin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		double b = scanner.nextDouble();
		scanner.nextLine();
		String st =  scanner.nextLine();
		
	System.out.println("String:" +st);
	System.out.println("Double:" +b);
	System.out.println("Int:" +a);
		scanner.close();
	}

}

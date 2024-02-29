package com.coding;
import java.util.Scanner;
public class Capgemini {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:" );
	    String str1 = sc.next();
	    String str=str1.toLowerCase();
	    int length=str.length();
	    char[] ch=str.toCharArray();
	    
	    System.out.println("Reverses String is");
        for(int i=length-1;i>=0;i--) {
        	System.out.print(ch[i]);
        }
	}

}

package com.coding;

public class Polindrome {
	public static void main(String[] args) {
		String S = "MADAM", reverse= "";
		for (int i= S.length() -1; i >=0; i--) {
			reverse = reverse + S.charAt(i);
			
		}
		System.out.println(reverse);
		if(S.equals(reverse)) {
			System.out.println("MADAM is a Polindrome");
		}
		else {
			System.out.println("MADAM is not a polindrome");
		}
	}

}

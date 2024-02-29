package com.coding;

import java.util.*;


public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Raj");
		list.add("Anu");
		list.add("Priya");
		list.add("Sravya");
		
		list.forEach(a->{System.out.println(a);});
		 System.out.println("----------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
//		// TODO Auto-generated method stub
//		long count = list.stream().count();
		 System.out.println("----------------");
		list.stream().sorted().forEach(System.out::println);
//		  System.out.println("----------------");
//		  list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		System.out.println("Count of numbers:" +count);
//		 System.out.println("----------------");
//		System.out.println("print:" +list.get(3));
//		System.out.println("Print:" +list.remove(0).charAt(0));
		 System.out.println("----------------");
//		String l1 = list.remove(0);
//		System.out.println("Fresh list:" +l1);
	
		System.out.println("Updated List:");
		for(String element:list)
			System.out.println(element);
	}
	
	

}

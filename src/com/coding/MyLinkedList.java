package com.coding;

import java.util.*;
public class MyLinkedList {

	public static void main(String[] args) {
		
		//Adding elements
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Pushpa");
		ll.add("Amulya");
		ll.add("Sowji");
		ll.add("Likitha");
System.out.println("invoking all elements:" +ll);

    ll.add(1,"Vara");
    System.out.println("after adding:"+ll);
    
    ll.add("yogesh");
    System.out.println("finally:"+ll);
    
    LinkedList<String> ll3=new LinkedList<String>();
    ll3.add("Raj");
    ll3.add("kala");
    ll.addAll(0, ll3);
    System.out.println(ll);
    
    ll.addFirst("Priya");
    ll.addLast("Prasad");
System.out.println(ll);


//removing elements
System.out.println(ll.get(4));
ll.remove(4);
System.out.println("After Eliminating with index:  "+ll);
ll.remove("Prasad");
System.out.println("After removing With String:  "+ll);

ll.contains(ll3);
System.out.println();
ll.removeAll(ll3);
System.out.println("After Object ll3 deleting:   "+ll);
ll.removeFirst();
System.out.println(":After FirstElement deleting:  "+ll);
ll.removeLast();
System.out.println(":After LastElement deleting:  "+ll);
System.out.println("Updating List:   "+ll);


ll.clone();
System.out.println(ll);
 ll.clear();
 System.out.println(ll);

	}
	
	
	
}

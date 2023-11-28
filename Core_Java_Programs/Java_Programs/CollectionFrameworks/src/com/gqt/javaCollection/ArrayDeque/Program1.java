package com.gqt.javaCollection.ArrayDeque;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(50);
		ad.add(150);
		ad.add(25);
		ad.add(75);
		ad.add(125);
		ad.add(175);
		ad.addFirst("Noshi");
		ad.addLast("Navya");
		
		System.out.println(ad);
//		ArrayDeque<Integer> ad2 = new ArrayDeque<Integer>();
		// ArrayDeque ad1= new ArrayDeque();
		System.out.println(ad.contains("ad"));
		System.out.println(ad.contains("Noshi"));
    	System.out.println(ad.pop());
		System.out.println(ad.poll());
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad.remove(25));
		System.out.println(ad);
		System.out.println(ad.isEmpty());
		System.out.println(ad.getFirst());
	}
}

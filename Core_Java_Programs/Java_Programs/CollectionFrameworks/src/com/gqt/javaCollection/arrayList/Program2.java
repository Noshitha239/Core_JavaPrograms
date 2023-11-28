package com.gqt.javaCollection.arrayList;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		// al.clear();
		// System.out.println(al);
		ArrayList al2 = (ArrayList) al.clone();
		System.out.println(al2);
		boolean res = al.contains(75);
		System.out.println(res);
		res = al.contains(275);
		System.out.println(res);
		ArrayList al1 = new ArrayList();
		al1.add(1000);
		al1.add(2000);
		al1.add(3000);
		al1.add(4000);
		al1.add(5000);
		System.out.println(al1);
		res = al1.contains(al);
		System.out.println(res);
		res = al.containsAll(al1);
		System.out.println(res);

	}

}

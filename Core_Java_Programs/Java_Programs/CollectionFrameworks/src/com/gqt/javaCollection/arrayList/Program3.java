package com.gqt.javaCollection.arrayList;

import java.util.ArrayList;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add("Bhavana");
		al.add(25);
		al.add(80);
		al.add("Noshi");
		al.add(175);
		System.out.println(al);
		int size=al.size();
		System.out.println(size);
		al.ensureCapacity(10);
		size=al.size();
		System.out.println(size);
		Object object =al.get(2);
		System.out.println(object);
		System.out.println(al.getClass());
		int code=al.hashCode();
		System.out.println(code);
		int index=al.indexOf(80);
		System.out.println(index);
		index=al.indexOf(155);
		System.out.println(index);
		boolean b=al.isEmpty();
		System.out.println(b);
		System.out.println(index);
		Object remove = al.remove(5);
		System.out.println(remove);
		System.out.println(al);
		
		
		
		ArrayList al2 = (ArrayList) al.clone();
		System.out.println(al2);
		boolean res = al.contains(75);
		System.out.println(res);
		res = al.contains(275);
		System.out.println(res);
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.addAll(al);
		boolean b1=al1.removeAll(al);
		System.out.println(b1);
		System.out.println(al1);
		
	}

}

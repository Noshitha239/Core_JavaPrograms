package com.gqt.javaCollection.HashSet;
import java.util.HashSet;
public class Program1{
	public static void main(String[] args){
		//TODO Auto-generated method stub
		HashSet ad = new HashSet();
		ad.add(100);
		ad.add(50);
		ad.add(150);
		ad.add(25);
		ad.add(75);
		ad.add(125);
		ad.add("Noshi");
		ad.add("Navya");
		ad.add(175);
		System.out.println(ad);
		System.out.println(ad.getClass());
		System.out.println(ad.hashCode());
		System.out.println(ad.iterator());
		System.out.println(ad.spliterator());
		System.out.println(ad.toArray());
	}
}

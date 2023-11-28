package com.gqt.javaCollection.TreeSet;
import java.util.TreeSet;
public class Tree1 {
public static void main(String[] args) {
	TreeSet ad=new TreeSet();
	ad.add(335);
	ad.add(400);
	ad.add(200);
	ad.add(120);
	ad.add(70);
	ad.add(110);
	ad.add(111);
	ad.add(21);
	ad.add(250);
	ad.add(150);
	ad.add(125);
	ad.add(175);
	ad.add(275);
	ad.add(300);
	ad.add(325);
	System.out.println(ad);
	System.out.println(ad.ceiling(21));
	System.out.println(ad.floor(21));
	System.out.println(ad.pollLast());
	
}
}

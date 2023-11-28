package com.gqt.javaCollection.LinkedList;
import java.util.LinkedList;
public class Program1{
	public static void main(String[] args){
		// TODO Auto-generated method stub
		 LinkedList ll=new LinkedList();
	        ll.add(1);
	        ll.add("Noshitha");
	        ll.add(30);
	        ll.add(2);
	        ll.add("Bhavana");
	        ll.add(50);
	        System.out.println(ll);
	        ll.add(2,"Sai");
	        System.out.println(ll);
//	        al.add(100,1000);// we cannot cross the limits of the arrayList boundary for this method
//	        System.out.println(al);
	        LinkedList ll1= new LinkedList();
	        ll1.add(1);
	        ll1.add(2);
	        ll1.add(3);
	        ll1.add(4);
	        ll1.add(5);
	        System.out.println(ll1);
	        ll.addAll(ll1);
	        System.out.println(ll);
	        ll1.addAll(2,ll1);
	        System.out.println(ll);
	        ll1.add("Noshith");
	        ll1.add('V');
	        ll1.add(true);
	        ll1.add(234.567f);
	        ll1.add(123456.45678);
	        System.out.println(ll1);
	        LinkedList<Integer>ll2= new LinkedList<Integer>();
	        ll2.add(100);
//	        al2.add("Poornima");//cannot store Strings
//	        al2.add(false);// cannot store Boolean value
	        System.out.println(ll2);    
	}
}

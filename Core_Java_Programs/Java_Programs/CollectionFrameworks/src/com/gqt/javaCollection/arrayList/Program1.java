package com.gqt.javaCollection.arrayList;
import java.util.ArrayList;
public class Program1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        al.add(2,100);
        System.out.println(al);
//        al.add(100,1000);// we cannot cross the limits of the arrayList boundary for this method
//        System.out.println(al);
        ArrayList al1= new ArrayList();
        al1.add(1000);
        al1.add(2000);
        al1.add(3000);
        al1.add(4000);
        al1.add(5000);
        System.out.println(al1);
        al.addAll(al1);
        System.out.println(al);
        al.addAll(2,al1);
        System.out.println(al);
        al.add(al1);
        System.out.println(al);
        
        al1.add("Bindu");
        al1.add('r');
        al1.add(true);
        al1.add(234.567f);
        al1.add(123456.45678);
        System.out.println(al1);
        
        ArrayList<Integer> al2= new ArrayList<Integer>();
        al2.add(100);
//        al2.add("Poornima");//cannot store Strings
//        al2.add(false);// cannot store Boolean value
        System.out.println(al2);
        
        
	}

}

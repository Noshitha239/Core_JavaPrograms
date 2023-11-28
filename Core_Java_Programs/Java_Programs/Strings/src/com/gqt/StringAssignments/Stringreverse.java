//Write a program to reverse a string without using String inbuilt function.
package com.gqt.StringAssignments;
import java.util.Scanner;
public class Stringreverse{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1= sc.next();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--) {
        	s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
	}

}

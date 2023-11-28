//21) You are creating a student portal for your school. The portal needs to display the average 
//marks of a student for 8 semesters. Your task is to write a Java function that takes the 
//marks of each semester individually and returns the average.
package Interviewqestionsset1;
import java.util.*;
public class Averagemarks21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of semesters:");
		int n=sc.nextInt();
		System.out.println("enter the marks for each semester");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		float avag;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avag=sum/n;
        System.out.println(avag);
	}

}

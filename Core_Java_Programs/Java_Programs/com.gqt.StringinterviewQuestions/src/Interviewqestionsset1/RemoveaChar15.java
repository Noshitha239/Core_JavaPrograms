//15) Write a program to remove a character from String?
package Interviewqestionsset1;
import java.util.*;
public class RemoveaChar15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string:");
		String s1=sc.next();
		int[] arr=new int[100];
		String s3="";
		System.out.println("enter the second string:");
		String s2=sc.next();
		
		for(int i=0;i<s2.length();i++) {
			arr[s2.charAt(i)-'a']=1;
		}
       
		for(int i=0;i<s1.length();i++) {
			if(arr[s1.charAt(i)-'a']!=1) {
				s3=s3+s1.charAt(i);
			}
		}
		s1=s3;
		System.out.println(s1);
	}

}

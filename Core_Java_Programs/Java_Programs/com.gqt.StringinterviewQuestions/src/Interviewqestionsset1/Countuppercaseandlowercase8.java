//8) Write a java program to take a string as user input and returns the count of uppercase 
//letters and lowercase letters
package Interviewqestionsset1;
import java.util.*;
public class Countuppercaseandlowercase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		int Uppercount=0; 
		int Lowercount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<=90) {
				Uppercount++;

			}
			if(s.charAt(i)>90) {
				Lowercount++;
			}
		}
		System.out.println("Number of Uppercases:"+Uppercount);
		System.out.println("Number of Lowercases:"+Lowercount);
	}

}

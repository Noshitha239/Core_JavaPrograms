//12) Write a Java Program to Check Leap Year?
package Interviewqestionsset1;
import java.util.*;
public class Leapyear12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Year:");
		int n=sc.nextInt();
	
		if((n % 400 == 0) ||
			       (n % 100 != 0) &&
			       (n % 4 == 0)) {
			System.out.println("the give year is leap year");
		}
		else
		{
			System.out.println("the given year is not leap year");
		}
	}

}

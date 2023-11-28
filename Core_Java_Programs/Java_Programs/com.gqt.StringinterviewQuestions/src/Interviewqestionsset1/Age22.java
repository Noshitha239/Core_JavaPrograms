//22) 11. Write a Java program that categorizes people based on their age: Child (0-
//12), Teen (13-19), Adult (20-59), Senior (60+)
package Interviewqestionsset1;
import java.util.*;
public class Age22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Age:");
		int age=sc.nextInt();
		if(age>0 && age<=12) {
			System.out.println("child");
		}
		else if(age>13 && age<=19) {
			System.out.println("Teen");
		}
		else if(age>20 && age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("senior");
		}
	}

}

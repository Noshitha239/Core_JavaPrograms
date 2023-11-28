//1) How do you swap two numbers without using a third variable in Java?
package Interviewqestionsset1;
import java.util.Scanner;
public class Swapping1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a=sc.nextInt();//1
        System.out.println("Enter Second number: ");
        int b=sc.nextInt();//2
        a=a+b;//3
        b=a-b;//1
        a=a-b;//2
        System.out.println("a = "+a);
        System.out.println("b = "+b);
	}
}

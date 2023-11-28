//13) Write Java Program to Display Armstrong Number Between Two Intervals?
package Interviewqestionsset1;
import java.util.*;
public class Displayamstrong13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1, num2;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the first number ::");
	      num1 = sc.nextInt();
	      System.out.println("Enter the second number ::");
	      num2 = sc.nextInt();

	      for (int i = num1; i<num2; i++){
	         int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = sum + (rem * rem * rem);
	            check = check / 10;
	         }
	         if(sum == i){
	            System.out.println(i);
	         }
	      }
	}

}

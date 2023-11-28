//23) Write a java program to display all even prime numbers?
package Interviewqestionsset1;
import java.util.*;
public class EvenPrime23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2) {
        	System.out.println("no even primes with in specified range");
        }
        else if(n>=2) {
        	System.out.println("even prime is"+2);
        }
	}

}

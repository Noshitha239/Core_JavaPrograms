//2) Write a Java program to print a Fibonacci sequence using recursion.
package Interviewqestionsset1;
import java.util.Scanner;
public class Fibonacci2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // Change this value to generate the first n Fibonacci numbers
		System.out.println("Fibonacci Series (first " + n + " numbers):");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

}

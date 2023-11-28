//5) How can you find the factorial of an integer in Java?
package Interviewqestionsset1;

import java.util.Scanner;

public class Factorial5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		int r1;
		int r=0;
		for(int i=1;i<=n;i++){
			{
				r1=fact;
				fact=r1*i;
				r=fact;
			}
	    }
		System.out.println(r);
	}

}

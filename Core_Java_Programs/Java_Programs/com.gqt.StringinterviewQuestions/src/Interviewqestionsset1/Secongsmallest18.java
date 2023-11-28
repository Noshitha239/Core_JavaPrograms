//18) Find Second Smallest Element in an Array?

package Interviewqestionsset1;

import java.util.Arrays;
import java.util.Scanner;

public class Secongsmallest18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}

		Arrays.sort(array);
		System.out.println("sorted Array ::"+Arrays.toString(array));
		int res = array[1];
		System.out.println("2nd smallest element is ::"+res);
	}


}



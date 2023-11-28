//9) Given an array of integers and a number k, write a function that returns true if given array 
//can be divided into pairs such that sum of every pair is divisible by k. 
// Example : 
//Input : arr = [9, 5, 7, 3], k = 6 
//Output: True 
//Explanation: {(9, 3), (5, 7)} is a 
//possible solution. 9 + 3 = 12 is divisible 
//by 6 and 7 + 5 = 12 is also divisible by 6.
package Interviewqestionsset1;
import java.util.*;
public class Sumofeverypair9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int k=0;
		int l=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum=arr[i]+arr[j];
				if(sum%6==0) {
					k=arr[i];
					l=arr[j];
					count++;
					System.out.print(k+" ");
					System.out.println(l);
				}
			}
		}
		if(count>0) {
			System.out.println("true");
		}
	}
}



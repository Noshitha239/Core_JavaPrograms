//19) Find Second largest Element in an Array?
package Interviewqestionsset1;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargest19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		  Arrays.sort(a);
		  int s=a[n-2];
		System.out.println("The Second largest element in an array: "+s);
	}
}

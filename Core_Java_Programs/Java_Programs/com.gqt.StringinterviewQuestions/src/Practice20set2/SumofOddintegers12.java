//12.write a program to find the sum of odd integers in an array and prduct of even integers in array.finally find sum of the both of the results.
//	example: 
//	input:[3,4,5,2,1,7]
//        output:
//        odd sum=3+5+1+7=16
//        even product=4+2=6
//	final sum=22

package Practice20set2;
import java.util.*;
public class SumofOddintegers12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		System.out.println("enter the array:");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		int product=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				sum=sum+a[i];
			}
			else
			{
				product=product*a[i];
			}
		}
		System.out.println(sum);
		System.out.println(product);
		int f=sum+product;
		System.out.println(f);
	}
}

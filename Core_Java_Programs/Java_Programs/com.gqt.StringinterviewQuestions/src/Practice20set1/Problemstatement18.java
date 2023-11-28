//18) Problem Statement –
//A chocolate factory is packing chocolates into the packets. The 
//chocolate packets here represent an array of N number of integer 
//values. The task is to find the empty packets(0) of chocolate and push 
//it to the end of the conveyor belt(array)
package Practice20set1;
import java.util.*;
public class Problemstatement18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]==0) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");

		}

	}


}



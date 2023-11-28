//7.convert the given integer into a binary number format.
package Practice20set2;
import java.util.*;
public class BinarynumberFormate7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the a number:");
		int n=sc.nextInt();
		int a[]=new int[100];
		int i=0;
		while(n>0) {
			a[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}
	}
}

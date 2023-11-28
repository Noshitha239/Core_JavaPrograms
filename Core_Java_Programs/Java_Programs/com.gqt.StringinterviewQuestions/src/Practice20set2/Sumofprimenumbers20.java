//20. find sum of prime numbers in a given range.
package Practice20set2;
import java.util.*;
public class Sumofprimenumbers20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int count;
		System.out.println("enter the range: ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						count++;
						break;
					}
				}
			if(count==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of prime numbers is: "+sum);
	}
}

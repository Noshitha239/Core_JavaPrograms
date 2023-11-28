//13.find the given input number is perfect number or not.The perfect number is the number where the sum of its divisors is equal to the number itself.
package Practice20set2;
import java.util.*;
public class Perfectnumber13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
	}
}

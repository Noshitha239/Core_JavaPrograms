//17.check number belongs to Fibonacci series or not.
package Practice20set2;
import java.util.Scanner;
public class FibanacciBelongsto17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		a[0] = 0; 
		a[1] = 1; 
		for (int i = 2; i < n; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		System.out.println("Fibonacci Series:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		int flag=1;
		int i=0;
		System.out.println("Enter n1 value: ");
		int n1=sc.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==n1) {
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("The given number belongs to a fibonacci series");
		}
		else if(flag==0)
		{
			System.out.println("The given number not belongs to a fibonacci series");
		}
	}
}



















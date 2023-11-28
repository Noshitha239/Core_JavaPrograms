//17. program to find the second largest integer in an array.
package InterviewquestionsSet2;
import java.util.Scanner;
import java.util.Arrays;
public class Secondlargest17 {
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

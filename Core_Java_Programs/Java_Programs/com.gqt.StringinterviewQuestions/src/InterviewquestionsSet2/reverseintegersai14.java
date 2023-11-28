//14. Take 10 integer inputs from user and store them in an array. and copy all the
//elements into an another array in reverse order.
package InterviewquestionsSet2;
import java.util.Scanner;
public class reverseintegersai14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int a1[]=new int[n];
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        int j=0;
        for(int i=a.length-1;i>=0;i--) {
        	a1[j]=a[i];
        	j++;
        }
        for(int i=0;i<=a.length-1;i++){
        System.out.println(a1[i]);
	}
	}
}

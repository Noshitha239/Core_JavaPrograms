//17. Find largest and smallest elements of an array.
package Interviewqestionsset1;
import java.util.*;
public class Smalllarge17 {
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
		int s=a[0];
		int l=a[0];
		for(int i=0;i<a.length;i++) {
				if(a[i]<s) {
					s=a[i];
				}
				if(a[i]>l){
					l=a[i];
				}
		}
		System.out.println("The smallest element in an array: "+s);
		System.out.println("The largest element in an array: "+l);
	}
}

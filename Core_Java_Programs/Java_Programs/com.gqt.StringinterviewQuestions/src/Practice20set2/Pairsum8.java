//8.Find all pairs of elements from an array whose sum is equal to given number
// Given a  array,we need to find all pairs whose sum is equal to number X.
//   For example:
//
//        1
//	2
//	3
//	4
// 
//	array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
//	Pair of elements whose sum is equal to 15 :  7, 8 and -5, 20
package Practice20set2;
import java.util.*;
public class Pairsum8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		System.out.println("enter the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the sum value:");
        int s=sc.nextInt();
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a.length;j++) {
        		if(a[i]+a[j]==s) {
        			System.out.println(a[i]+" "+a[j]);
        		}
        	}
        }
	}

}

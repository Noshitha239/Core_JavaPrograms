//2.Given a sorted array of distinct integers and a target value, return the index if
//the target is found. If not, return the index where it would be if it were inserted in
//order.[Example Input: nums = [1,3,5,6], target = 5
//Output: 2]
package InterviewquestionsSet2;
import java.util.*;
public class Targetvalue2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		System.out.println("enter the array :");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int flag=0;
		System.out.println("enter the key value:");
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				flag=1;
				System.out.println(i);
				break;
			}   
		}
		if(flag==0) {
			System.out.println("not contain");
		}
	}
}

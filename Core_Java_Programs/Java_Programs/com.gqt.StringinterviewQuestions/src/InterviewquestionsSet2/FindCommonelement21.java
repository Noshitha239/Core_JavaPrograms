
//21. How to Find Common Element Between Two Arrays In Java?1
package InterviewquestionsSet2;
import java.util.*;
public class FindCommonelement21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=sc.nextInt();
        System.out.println("enter the array:");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("enter the m value:");
        int m=sc.nextInt();
        System.out.println("enter the array:");
        int b[]=new int[m];
        for(int i=0;i<b.length;i++) {
        	b[i]=sc.nextInt();
        }
        int c[]=new int[n];
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<b.length;j++) {
        		if(a[i]==b[j]) {
        			System.out.println(a[i]);
        		}
        	}
        }
	}
}

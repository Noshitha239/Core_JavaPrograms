//16) Determine Array is a subset of another array or not?
package Interviewqestionsset1;
import java.util.*;
public class Subsetofanotherarray16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		System.out.println("enter the array");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter the array");
        int b[]=new int[m];
        for(int i=0;i<b.length;i++) {
        	b[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<b.length;j++) {
        		if(a[i]==b[j]) {
        			flag=1;
        		}
        		}
        }
       if(flag==1) {
        	System.out.println("contains");
     }
       
	      if(flag==0)
        {
        	System.out.println("not contain");
        	
        }
	}

}

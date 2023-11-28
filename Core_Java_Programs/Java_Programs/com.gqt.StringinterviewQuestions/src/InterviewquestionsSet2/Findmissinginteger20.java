//20. program to find the missing integer in an array of range 1 to 10.
package InterviewquestionsSet2;
import java.util.*;
public class Findmissinginteger20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
			System.out.println("enter the size:");
			int n=sc.nextInt();
			int max=0;
			int a[]=new int[n];
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			int c=0;
			for(int i=0;i<a.length;i++) {
			max=Math.max(max,  a[i]);
			
			}
			int a2[]=new int[max];
			for(int i=0;i<a2.length;i++) {
				a2[i]=i+1;
			}
			for(int i=0;i<a2.length;i++) {
				int flag=1;
				for(int j=0;j<a.length;j++) {
					if(a2[i]!=a[j]) {
						flag=0;
					}
					else
					{
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.print(a2[i]+" ");
				}
			
		}
	}

}

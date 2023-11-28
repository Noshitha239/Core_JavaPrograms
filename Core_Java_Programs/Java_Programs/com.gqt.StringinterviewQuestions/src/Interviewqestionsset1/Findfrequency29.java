//29)Write a program to find the frequency of each digit in a number.
package Interviewqestionsset1;
import java.util.*;
public class Findfrequency29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count=0;
			int n,d,t;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			n=sc.nextInt();
			
			System.out.println("digit\t frequency");
			for(int i=0;i<=9;i++) {
				count=0;
				t=n;
				while(t>0) {
					d=t%10;
					if(d==i) {
						count++;
					}
					t=t/10;
				}
				if(count>0) {
					System.out.println(i+"\t"+count);
				}
			}
	}

}

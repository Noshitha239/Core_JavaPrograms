//28)Write a Program to Print the Hollow Diamond Star Pattern. 

package Interviewqestionsset1;
import java.util.Scanner;
public class Diamondpattern28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {  
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(j==1||j==i) {
        		System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
        	}
			System.out.println();
		}
		for (int i=0;i<=n;i++) {  
			for(int j=1;j<=i;j++) {      
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) { 
				if(j==n||i==j) {
				System.out.print("* ");	
				}
				else {
					System.out.print("  ");	
				}
			}
			System.out.println();
		}
	}
}

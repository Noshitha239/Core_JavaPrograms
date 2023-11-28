//27) Write a Program to print the Full Pyramid Star pattern. 
// * 
// * * 
// * * *
// * * * *
//* * * * *

package Interviewqestionsset1;
import java.util.*;
public class Pyramidpattern27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++) {
        	for(int j=n;j>i;j--){
        		System.out.print(" ");
        	}
        	for(int j=0;j<i;j++){
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        System.out.println();
	}
}

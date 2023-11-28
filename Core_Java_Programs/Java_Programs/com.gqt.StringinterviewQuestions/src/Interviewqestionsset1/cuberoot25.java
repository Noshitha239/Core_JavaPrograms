//25) Write a program to find the cube root of a number.
package Interviewqestionsset1;
import java.util.*;
public class cuberoot25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        System.out.println("enter number");
	        int n=sc.nextInt();
	        /*int cube=0;
	        for(int i=0;i<n;i++) {
	        	if(i*i*i<=n) {
	        		cube=i;
	        	}
	        }
	        System.out.println(cube);*/
	        System.out.println(Math.cbrt(n));
		}
	}



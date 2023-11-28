//23. Move all negative numbers to beginning and positive to end
package InterviewquestionsSet2;

import java.util.Scanner;

public class Movenegativenumbers23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		 int n=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<a.length;i++) {
	        	a[i]=sc.nextInt();
	        }
	        for(int i=0;i<=a.length;i++) {
	        	for(int j=i+1;j<a.length;j++) {
	        	int temp=0;
	        		if(a[i]>a[j]) {
	        		   temp=a[i];
	        		   a[i]=a[j];
	        		   a[j]=temp;
	        		}
	        	}
	        }
	        System.out.println("Sorted Array");
	        for(int i=0;i<a.length;i++) {
	        	System.out.println(a[i]+" ");
	        } 
		
	}

}

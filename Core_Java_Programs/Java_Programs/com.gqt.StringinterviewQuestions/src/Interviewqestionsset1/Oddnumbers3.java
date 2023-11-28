//3) How do you check if a array of integers contains only odd numbers in Java?
package Interviewqestionsset1;
import java.util.Scanner;
public class Oddnumbers3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++) {
        	if(a[i]%2!=0){
        		System.out.println(a[i]);
        	}

        }
        
	}

}

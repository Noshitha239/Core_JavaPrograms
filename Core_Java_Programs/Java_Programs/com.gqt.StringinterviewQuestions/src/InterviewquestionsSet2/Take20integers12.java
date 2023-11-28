//12.Take 20 integer inputs from user and print the following:
//number of positive numbers
//number of negative numbers
//number of odd numbers
//number of even numbers
//number of 0s.
package InterviewquestionsSet2;
import java.util.*;
public class Take20integers12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				count++;
			}
		}
		System.out.println("the positive numbers are:"+ count);
		int count1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count1++;
			}
		}
		System.out.println("the negative number count"+count1);

		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count2++;
			}
		}	
		System.out.println("the even number count:"+ count2);

		int count3=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count3++;
			}
		}
		System.out.println("the odd numbers count are"+count3);
		int count4=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count4++;
			}
		}
		System.out.println("the 0s count are"+count4);
	}

}

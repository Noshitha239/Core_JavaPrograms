//22. Find the highest palindrome number in a given array which contains both palindrome
//and non-palindrome numbers?
package InterviewquestionsSet2;
import java.util.Scanner;
import java.util.Arrays;
public class Hieghestpalindrome22 {
	public static void main(String args[]){ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size: ");
		int n=sc.nextInt();
		 int arr[] = new int[n];
		 System.out.println("enter elements: ");
		 for(int i=0;i<arr.length;i++) {
	        	arr[i]=sc.nextInt();          
	        }
	      System.out.println("Given array is: "+Arrays.toString(arr));
	      Arrays.sort(arr);
	      for (int i = arr.length - 1; i >= 0; i--){
	         String reverse = "";
	         String original = Integer.toString(arr[i]);
	         int length = original.length();   
	         for ( int j = length - 1; j >= 0; j-- )  {
	            reverse = reverse + original.charAt(j); 
	         }
	         if (original.equals(reverse))  {
	            System.out.println(arr[i] + " is the largest palindrome of a given array.");
	         }
	         break;
	      }
	}
}
//System.out.println("enter the elements in an array: ");
//int n1[]=new int[n];
//int n2[]=new int[n];
//int n3=0;
//for(int i=0;i<n1.length;i++) {
//	n1[i]=sc.nextInt();
//	String o1 = Integer.toString(n1[i]);            
//}
//int r,sum=0,temp;    
//int j=0;
//for(int i=0;i<n1.length;i++){
//	temp=n1[i];
//	if(o1.charAt(i)>0) {    
//		r=n1[i]%10; 
//		sum=(sum*10)+r;    
//		n1[i]=n1[i]/10; 
//		}
//	    else if(temp==sum){
//			n2[j]=n1[i];
//			j++;
//		}
//	else{
//		n3=n1[i];
//	}
//}
//for(int i=0;i<n1.length;i++) {
//	System.out.println(n2[i]);
//}
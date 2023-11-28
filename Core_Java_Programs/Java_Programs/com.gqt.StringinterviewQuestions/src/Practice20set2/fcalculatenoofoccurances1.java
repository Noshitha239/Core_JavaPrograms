//1.Write a program in Java to calculate the number of times a digit ‘D’ appears in a number N. You have to take N and D as inputs from the user.

package Practice20set2;
import java.util.*;
public class fcalculatenoofoccurances1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int a=sc.nextInt();
		System.out.println("Enter digit: ");
		char b=sc.next().charAt(0);
		int c=0;
		String s = Integer.toString(a);
		for(int i=0;i<s.length();i++){
        if(s.charAt(i)==b)
            c=c+1;
		}
		System.out.println(c);
	}
}



//4) How do you remove spaces from a string in Java?
package Interviewqestionsset1;
import java.util.Scanner;
public class Removewhitespaces4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        	   //System.out.print("");
        	}
        	else{
        		s1=s1+s.charAt(i);
        	}
        }
        System.out.print(s1);
	}
}

//7. Write a program that takes your full name as input and displays the abbreviations//of the first and middle names except the last name which is displayed as it is. For//example, if your name is Robert Brett Roser, then the output should be R.B.Roser.
package InterviewquestionsSet2;
import java.util.*;
public class Abrivation7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String p="";
		String s3="";
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c+=1;
			}
		}
		String arr[]=new String[c+1];
		int j=0;String s2="";
		for(int i=0;i<s.length();i++) {

			if(s.charAt(i)==' ') {
				arr[j]=s2;

				j++;
				s2="";
			}
			else {
				s2=s2+s.charAt(i);

			}
			arr[j]=s2;
		}


		for(int i=0;i<arr.length-1;i++) {
			s3+=arr[i].charAt(0)+".";
		}

		System.out.println(s3+arr[c]);
	}

}

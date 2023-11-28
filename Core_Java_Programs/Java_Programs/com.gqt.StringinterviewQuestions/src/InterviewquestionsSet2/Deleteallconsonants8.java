//8.Write a program to delete all consonents from the string "Hello, have a good day"
package InterviewquestionsSet2;
import java.util.Scanner;
public class Deleteallconsonants8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int j=0;
		System.out.println("Enter a string");
		Scanner so1=new Scanner(System.in);
		s= so1.nextLine();
		char ch[]=new char[20];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='A'||s.charAt(i)=='e'|| s.charAt(i)=='E'||s.charAt(i)=='i'|| s.charAt(i)=='I'||s.charAt(i)=='o'|| s.charAt(i)=='O'||s.charAt(i)=='U'|| s.charAt(i)=='u')
			{
				ch[j++]=s.charAt(i);
			}
			else
			{
				continue;
			}
		}
		for(int i=0;i<j;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
	}

}

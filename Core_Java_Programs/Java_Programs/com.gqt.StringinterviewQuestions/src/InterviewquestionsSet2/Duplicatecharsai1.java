//1.write a program to find duplicate characters in a string.
package InterviewquestionsSet2;
import java.util.Scanner;
public class Duplicatecharsai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s1=sc.nextLine();
		char str[]=s1.toCharArray();
		int len[]=new int[s1.length()];
		for(int i=0;i<s1.length();i++){
			len[i]=1;
			for(int j=i+1;j<s1.length();j++){
				if(str[i]==str[j]) {
					len[i]++;
					str[j]=0;
				}
			}
		}
		for(int i=0;i<len.length;i++){
			if(len[i]>1) {
				System.out.println(str[i]);
			}
		}
	}
}

//10.WAP to reverse each word in a string. input : "i love my country" output: "i evol
//ym yrtnuoc".
package InterviewquestionsSet2;
import java.util.Scanner;
public class Reverseaword10 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		int s_count=0;
		String s1=" ";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ') {
				s_count=s_count+1;
			}
		}
//		System.out.println(s_count);
		int w_cunt=s_count+1;
		String S[]=new String[w_cunt];
		int count=0;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)==' ') {
				S[count]=s1;
				s1=" ";
				count++;
			}
			else {
				s1=s1+s.charAt(i);
			}
			S[count]=s1;
		}
				for(int i=S.length-1;i>=0;i--) {
					System.out.print(S[i]);
				}
//		for(int i=0;i<S.length;i++){
//			System.out.print(S[i]);
//		}
	}
}


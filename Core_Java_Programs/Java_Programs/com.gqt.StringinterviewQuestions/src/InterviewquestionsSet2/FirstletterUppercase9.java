//9. write a java program to capitalize each word in a string . input: "hello this is
//java program" then the output should be : " Hello This Is Java Program".
package InterviewquestionsSet2;
import java.util.Scanner;
public class FirstletterUppercase9 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c+=1;
			}
		}
		String ar[]=new String[c+1];
		String ar1[]=new String[c+1];
		String dummy="";
		int j=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				ar[j]=dummy;
				j++;
				dummy="";

			}
			else {
				dummy=dummy+s.charAt(i);
			}
			ar[j]=dummy;
		}

		for(int i=0;i<ar.length;i++) {
			ar1[i]= ar[i].substring(0,1).toUpperCase()+ar[i].substring(1, ar[i].length()); 
		}
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}
	}

}

	
		////		Scanner sc=new Scanner(System.in);
		////		String A=sc.next();
		////		String s="";
		////		String s2="";
		////		if(A.charAt(0)>='a' && A.charAt(0)<='z')
		////		{
		////			s=s+(char)(A.charAt(0)-32);
		////		}
		////		for(int i=1;i<A.length();i++)
		////		{
		////			s=s+A.charAt(i);
		////		}
		////		System.out.print(s); 
		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("Enter the String: ");
		//		String s=sc.nextLine();
		//		int s_count=0;
		//		String s1=" ";
		//		String s2[]=new String[100];
		//		for(int i=0;i<s.length();i++){
		//			if(s.charAt(i)==' ') {
		//				s_count=s_count+1;
		//			}
		//		}
		//		int w_cunt=s_count+1;
		//		String S[]=new String[w_cunt];
		//		int count=0;
		//		for(int i=0;i<s.length();i++){
		//			if(s.charAt(i)==' '){
		//				S[count]=s1;
		//				s1=" ";
		//				count++;
		//			}
		//			else{
		//				s1=s1+s.charAt(i);	
		//				s2[i]=s1;
		//			}
		//			S[count]=s1;
		//		
		//		}	
		//		for(int i=0;i<S.length;i++){
		//			System.out.print(S[i]);
		//		}
		//	}
		//}
		
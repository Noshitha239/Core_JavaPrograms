import java.util.*;
public class Split{
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		int s_count=0;
		String s1=" ";
		for(int i=0;i<=s.length();i++){
			if(s.charAt(i)==' '){
				s_count=s_count+1;
			}
		}
		int w_cunt=s_count+1;
		String S[]=new String[w_cunt];
		int count=0;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)==' '){
				S[count]=s1;
				s1=" ";
				count++;
			}
			else{
				s1=s1+s.charAt(i);
			}
		}
	}
}

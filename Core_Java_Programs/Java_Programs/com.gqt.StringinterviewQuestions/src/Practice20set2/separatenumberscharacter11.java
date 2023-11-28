//11.From the given input separate numbers and characters
//   Example- input:
//	   j34784ha
//           output: 
//	   jha
//           3478

package Practice20set2;
import java.util.*;
public class separatenumberscharacter11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.next();
		String s2="";
		String s3="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='z'){
				s2=s2+s.charAt(i);
			}
			else
			{
				s3=s3+s.charAt(i);
			}
		}
		System.out.println(s2);
		System.out.println(s3);
	}
}

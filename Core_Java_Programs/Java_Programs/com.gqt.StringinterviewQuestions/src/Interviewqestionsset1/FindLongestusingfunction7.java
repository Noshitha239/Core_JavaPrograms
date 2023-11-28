//7) Write the code in the findLongestWord() method which accepts a string and returns the 
//longest word
package Interviewqestionsset1;
import java.util.*;
public class FindLongestusingfunction7 {
	String findLongestWord(String s) {
		int leng=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				leng++; 
			}
		}
		System.out.println(leng);
		int count=0;
		String a[]=new String[leng];int j=0;
		String s3="";
		for(int i=0;i<s.length();i++) {

			if(s.charAt(i)!=' ') {
				s3+=s.charAt(i);
			}
			else {
				j++;
				s3="";
			}
			a[j]=s3;
		}
		int max=0;
		String n="";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max) {
				max=a[i].length();
				n=a[i];
			};
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		FindLongestusingfunction7 l=new FindLongestusingfunction7();
		System.out.println(l.findLongestWord(s));
	}

}



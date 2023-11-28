//4.Given a string, s, and two indices, start and end, print a substring consisting of
//all characters in the
//inclusive range from start to end - 1.
//Sample Input:Helloworld
//3
//7
//Output:lowo
package InterviewquestionsSet2;
import java.util.Scanner;
public class Rangeofstring4{
	public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a string: ");
     String S = sc.next();
     System.out.println("Enter a start value:");
     int start = sc.nextInt();
     System.out.println("Enter a end value:");
     int end = sc.nextInt();
     String s2=" ";
//     String S1 = S.substring(start,end+1);
//     System.out.println(S1);
     char []s1=S.toCharArray();
     for(int i=start;i<=end;i++) {
    	 if(i>=start&&i<=end) {
    		 s2=s2+S.charAt(i);
    	 }
    	
     }
     System.out.println(s2);
}
}
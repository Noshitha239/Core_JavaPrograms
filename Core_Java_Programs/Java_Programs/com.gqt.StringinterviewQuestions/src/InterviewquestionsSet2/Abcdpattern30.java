//30.print below pattern
//A B C
//A B
//A
//A
//A B
//A B C
package InterviewquestionsSet2;
import java.util.*;
public class Abcdpattern30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char i;
		char j;
		for(int k=2;k>=0;k--) {
			for(int m=0;m<=k;m++) {
				System.out.print((char)(m+65));
			}
			System.out.println();
		}
      for(i='A';i<='C';i++) {
    	  for(j='A';j<=i;j++) {
    		  System.out.print(j);
    	  }
    	  System.out.println();
      }
	}

}

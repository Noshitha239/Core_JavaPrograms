//2.Write a program in Java to Toggle the case of every character of a string. For instance, if the input string is “ApPLe”, the output should be “aPplE”.
package Practice20set2;
import java.util.Scanner;
public class toggleuppertolower2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=" ";
        for(int i=0;i<s1.length();i++) {
        	if(Character.isLowerCase(s1.charAt(i))){
        		 s2 = s2+Character.toUpperCase(s1.charAt(i));
            	
            }
        	else {
        		s2 = s2+Character.toLowerCase(s1.charAt(i));
        	}
        }
        
        System.out.println(s2);
	}

}

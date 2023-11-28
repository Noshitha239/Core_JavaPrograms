//20) The Caesar cipher is a type of substitution cipher in which each alphabet 
//in the plaintext or messages is shifted by a number of places down the 
//alphabet.
package Practice20set1;
import java.util.*;
public class Caesar20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.nextLine();
        System.out.println("enter key value");
        int n=sc.nextInt();
        String ceasar="";
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        		ceasar+=s.charAt(i);
        	}
        	else {
        		ceasar+=(char)(s.charAt(i)+n);
        	}
        }
        System.out.println(ceasar);
	}

}
	



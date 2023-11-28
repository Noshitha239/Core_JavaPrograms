import java.util.*;
public class ReversePallin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1=sc.next();
        
        String s2="";
        for(int i=s1.length()-1;i>=0;i--) {
        	s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2)==true) {
        	System.out.println("The given String is Palindrom");
        	
        }
        else {
        	System.out.println("The given String is not Palindrom");
        }
	}

}

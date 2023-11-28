import java.util.Scanner;

public class StringUppLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=sc.next();
       
        //System.out.println(s1.toUpperCase());
        //System.out.println(s1.toLowerCase());
        for(int i=0;i<s1.length();i++) {
        	if(Character.isUpperCase(s1.charAt(i))) {
        		Character.toLowerCase(s1.charAt(i));
        		
        	}
        	
        }
        	
	}

}

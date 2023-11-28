import java.util.Scanner;

public class CompareToIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=sc.next();
        System.out.println("enter the String-2: ");
        String s2=sc.next();
        if(s1.compareToIgnoreCase(s2)==0)
        {
        	System.out.println("Strings are equal");
        }
        else {
        	System.out.println("Strings are not equal");
        }
	}

}

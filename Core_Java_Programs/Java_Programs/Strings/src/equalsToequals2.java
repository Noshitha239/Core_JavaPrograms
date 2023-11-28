import java.util.Scanner;

public class equalsToequals2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=new String(sc.next());
        System.out.println("enter the String-2: ");
        String s2=new String(sc.next());
        if(s1==s2)
        {
        	System.out.println("Address are equal");
        }
        else {
        	System.out.println("Address are not equal");
        }
        if(s1.equals(s2)==true)
        {
        	System.out.println("String are equal");
        }
        else {
        	System.out.println("String are not equal");
        }
	}

}

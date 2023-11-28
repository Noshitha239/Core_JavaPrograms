import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String: ");
	        String s1=sc.nextLine();
	        System.out.println("Enter the Sub String: ");
	        String s2=sc.next();
	        if(s1.contains(s2)==true) {
	        	System.out.println("The String contain the Sub String");
	        }
	        else {
	        System.out.println("The String does not contain the Sub String");
	        }
	}

}

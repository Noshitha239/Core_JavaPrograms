import java.util.Scanner;

public class equalsIgnorecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the first string: ");
	        String s1=sc.nextLine();
	        System.out.println("Enter the second string: ");
	        String s2=sc.nextLine();
	        if(s1.equalsIgnoreCase(s2)==true) {
	        	System.out.println("Strings are equal");
	        }
	        else {
	        	System.out.println("Strings are not equal");
	        }
	}

}

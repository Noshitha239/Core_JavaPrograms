//5.Write a Java Program to reverse a string with using String inbuilt function reverse().
package Practice20set2;
import java.util.Scanner;
public class ReverseaStringusingBuiltin5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1.reverse();
        System.out.println(s1);
	}

}

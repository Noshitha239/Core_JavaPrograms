import java.util.Arrays;
import java.util.Scanner;
public class Anagram2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string1: ");
        String s1=sc.nextLine();
        System.out.println("Enter String2: ");
        String s2=sc.nextLine();
        char[] charArray= s1.toCharArray();
        char[] charArray1=s2.toCharArray(); 
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        Arrays.equals(charArray,charArray1);
        if(charArray.equals(charArray1)==true) {
        	System.out.println("Strings are Anagram");
        }
        else{
        	System.out.println("Strings are not Anagram");
        }
	} 

}

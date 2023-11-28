import java.util.Scanner;

public class Replacevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=sc.nextLine();
        String s="#";
        String s2="";
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
        	 System.out.print(s);
             s2=s2+s1.charAt(i);
        	}
        	else {
        		System.out.print(s1.charAt(i));
        	}
	}

}
}

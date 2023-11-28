import java.util.Scanner;

public class Removewhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=sc.nextLine();
        String s2="";
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)==' ') {
        	 System.out.print("");
             s2=s2+s1.charAt(i);
        	}
        	else{
        		System.out.print(s1.charAt(i));
        	}
	}
	}

}

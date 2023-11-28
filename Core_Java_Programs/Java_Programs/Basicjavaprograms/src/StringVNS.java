import java.util.Scanner;

public class StringVNS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        int count=0;
        int s2;
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
        	 count++;
        	 
        	 System.out.print(s1.charAt(i));
        	}
        	
        }
        
	}

}

import java.util.Scanner;

public class Asccivalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=sc.nextLine();
        int sum=0;
        int temp=0;
        
        for(int i=0;i<s1.length();i++) {
        	
        	temp=s1.charAt(i);
        	sum=sum+temp;
        	System.out.println("The value of "+s1.charAt(i)+" is "+temp);
        }
        System.out.println("The sum= "+sum);
	}

}

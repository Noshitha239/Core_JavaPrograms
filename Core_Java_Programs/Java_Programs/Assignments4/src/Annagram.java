import java.util.*;
public class Annagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=sc.nextLine();
        System.out.println("Enter the string-2: ");
        String s2=sc.nextLine();
        //int count=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s1.length();i++) {
        	int temp=0;
              	temp=s1.charAt(i);
            	sum1=sum1+temp;
            	System.out.println("The value of "+s1.charAt(i)+" is "+temp);
        }
        for(int i=0;i<s2.length();i++) {
        	int temp1=0;
         	temp1=s2.charAt(i);
       	    sum2=sum2+temp1;
       	    System.out.println("The value of "+s2.charAt(i)+" is "+temp1);
   	    }
        System.out.println("The string1 sum is "+sum1);
        System.out.println("The string2 sum is "+sum2);
        if(sum1==sum2) {
        	System.out.println("Strings are Anagram");
        }
        else {
        	System.out.println("Strings are not Anagram");
        }
        
        
	}

}

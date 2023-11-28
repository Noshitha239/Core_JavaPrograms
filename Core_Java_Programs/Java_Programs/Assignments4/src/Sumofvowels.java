import java.util.*;
public class Sumofvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1=sc.next();
        s1=s1.toLowerCase();
        int sum=0;
        int temp;
        for(int i=0;i<s1.length();i++) {
        if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
            temp=s1.charAt(i);
        	sum=sum+s1.charAt(i);
        	System.out.println("The value of :"+s1.charAt(i)+ " is"+ temp);
        }
        
      } 
        System.out.println("The sum of vowels is: "+sum);
        if(sum%2!=0) {
        	System.out.println("The sum vlue is Prime");
        	
        }
        else {
        	System.out.println("The sum vlue is not Prime");
        }
}
}
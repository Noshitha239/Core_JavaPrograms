import java.util.Scanner;

public class ProductOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        //int count=0;
        int product=1;
        int temp=0;
        
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
              	 //count++;
              	temp=s1.charAt(i);
            	product=product*temp;
            	System.out.println("The value of "+s1.charAt(i)+" is "+temp);
        	}
        	
        }
        System.out.println("The product= "+product);
	}

}

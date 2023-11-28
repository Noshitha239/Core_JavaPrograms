import java.util.Scanner;

public class StringVNS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String-1: ");
        String s1=sc.nextLine();
        //s1=s1.toLowerCase();
        String a=""; 
        String b="";
        String c="";
        String d="";
        //int count=0;
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
        	 //count++;
        	 System.out.print(s1.charAt(i));
        	 a=a+s1.charAt(i);
        	}
        	else if(s1.charAt(i)=='@'||s1.charAt(i)=='$'||s1.charAt(i)=='&'||s1.charAt(i)=='*'||s1.charAt(i)=='#'||s1.charAt(i)=='?'||s1.charAt(i)=='!') {
        		System.out.print(s1.charAt(i));
        		b=b+s1.charAt(i);
        	}
        	else if(s1.charAt(i)=='0'||s1.charAt(i)=='1'||s1.charAt(i)=='2'||s1.charAt(i)=='3'||s1.charAt(i)=='4'||s1.charAt(i)=='5'||s1.charAt(i)=='6'||s1.charAt(i)=='7'||s1.charAt(i)=='8'||s1.charAt(i)=='9' ){
        		System.out.print(s1.charAt(i));
        		c=c+s1.charAt(i);
        		
        	}
        	else {
        	     System.out.print(s1.charAt(i));
        	     d=d+s1.charAt(i);
            }
        	
	    }
        System.out.println();
        System.out.print(a);
        System.out.println();
        System.out.print(b);
        System.out.println();
        System.out.print(c);
        System.out.println();
        System.out.print(d);
        System.out.println();
        System.out.println(a+b+c+d);
}
}

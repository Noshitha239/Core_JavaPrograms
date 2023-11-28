import java.util.*;
public class StringWwreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1=sc.nextLine();
        int sp_cnt=0; String s2="";
        //counting words
        for(int i=0;i<s1.length();i++) {
           if(s1.charAt(i)==' ') {
        	   sp_cnt=sp_cnt+1;
           }
        }
        int word_cnt=sp_cnt+1;
        //creating Array
        String str[]=new String[word_cnt];
        int count=0;
        //Traverse String in reverse order
        for(int i=s1.length()-1;i>=0;i--) {
        	if(s1.charAt(i)==' ') {
        		str[count]=s2;
        		s2="";
        		count++;
        	}
        	else {
        		s2=s2+s1.charAt(i);
        	}
        }
        str[count]=s2;
        //Printing the array
        for(int i=str.length-1;i>=0;i--) {
        	System.out.print(str[i]+" ");
        }
	}

}

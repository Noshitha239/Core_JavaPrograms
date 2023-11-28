import java.util.Scanner;

public class Totalnoofvpwels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1=sc.nextLine();
        int sp_cnt=0; 
        //counting words
        for(int i=0;i<s1.length();i++) {
           if(s1.charAt(i)==' ') {
        	   sp_cnt=sp_cnt+1;
        	   
           }
           
        }
        int word_cnt=sp_cnt+1;
        System.out.println(word_cnt);
	}

}

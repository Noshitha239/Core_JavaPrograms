import java.util.Scanner;

public class Javatest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int count=25;
        for(int i=1;i<=n;i++) {
        	
        	for(int j=1;j<=n;j++) {
        		if(count<10) {
        			System.out.print("0"+count);
        			System.out.print(" ");
        		}
        		else {
        		System.out.print(count+" ");
        		
        		}
        		count--;
        		
        	}
        	System.out.println();
        }

	}




}

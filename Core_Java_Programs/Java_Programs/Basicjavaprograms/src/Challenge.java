import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter n size: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++) {
        	    for(int j=1;j<=i;j++) {
        		System.out.print(count+" ");
        			count=count+2;
        	}
        	System.out.println();
        }
	}

}

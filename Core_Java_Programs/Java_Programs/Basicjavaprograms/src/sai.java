import java.util.Scanner;
public class sai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        for(int i=0;i<=n-1;i++) {
        	for(int j=0;j<=n-1;j++) {
        		if(i==0||i==n-1 || i==n/2) {
        			System.out.print("*");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}System.out.println();
        	/*for(int j=0;j<=n-1;i++)
        	{
        		if (j==0||i==0||i==n/5||j==n-1) {
        			System.out.print("*");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}System.out.println();
        }*/
        }

}
}

import java.util.Scanner;
public class bigpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<=(a-1);i++) {
			for(int j=0;j<=(a-1)/2;j++) {
				if(i==0 || j==0 || j==a/2|| i==a/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a/2;j++) {
				if(i==0 || j==0 ||  i==a/2 ||i==a-1 || j==a/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
           System.out.print("  ");
			for(int j=0;j<=a/2;j++) {
				if(i==0 || j==0  ||i==a-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a/2;j++) {
				if(i==0 || j==0  ||i==a-1 || i==a/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a/2;j++) {
				if(i==0 || j==0 || i==a/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a/2;j++) {
				if(i==0 || j==0 || i==a-1||i==a/2+2||j==(a/5+2)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a/2;j++) {
				if(i==0 || j==a/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}



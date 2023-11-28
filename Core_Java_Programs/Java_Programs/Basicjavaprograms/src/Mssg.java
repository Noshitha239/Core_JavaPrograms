import java.util.Scanner;

public class Mssg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(i==0 || j==a/2 || i==a-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("     ");
			for(int j=0;j<a;j++) {
				if( j==0 || i==a-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<a;j++) {
				if(i==0 || j==a/2 || i==a-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a-1;j++) {
				if( j==0 || (j+i==(a-1)&&i<=a/2)||(i==(a/2)&&j<=a/2)||(j>=a/2&&(i==j))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a-1;j++) {
				if(i==0|| j==0 || i==a/2||i==a-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("     ");
			for(int j=0;j<=a-1;j++) {
				if(i==0|| j==a/2&&i<a-1||(i==a-1&&j<a/2)||j==0&&i>3*a/4)  {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a-1;j++) {
				if( j==0&&i!=0 || j==a-1&&i!=0|| i==a/2||(i==0 && j<a-1 && j!=0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a-1;j++) {
				if((j==0&& i<=a/2)||(j==a-1&&i<=a/2)|| i-j==a/2||(i+j==(a-1)+(a/2))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a-1;j++) {
				if(j==0&&i!=0 || j==a-1&&i!=0|| i==a/2||(i==0 && j<a-1 && j!=0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("     ");
			for(int j=0;j<=a-1;j++) {
				if(i==0&&j!=0||j==0&&i!=0&&i<a-1||(i==a-1&&j!=0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<a;j++) {
				if( j==0 || i==a-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<=a-1;j++) {
				if(j==0&&i!=0 || j==a-1&&i!=0|| i==a/2||(i==0 && j<a-1 && j!=0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<a;j++) {
				if((i==0 && j!=0)||
					(i==(a/2) && j!=0 && j!=(a-1))||
					(i==(a-1) && j<(a-1))||
					(j==0 && i!=0 && i<(a/2))||
					(j==(a-1) && i>a/2 && i!=a-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<a;j++) {
				if((i==0 && j!=0)||
					(i==(a/2) && j!=0 && j!=(a-1))||
					(i==(a-1) && j<(a-1))||
					(j==0 && i!=0 && i<(a/2))||
					(j==(a-1) && i>a/2 && i!=a-1)) {
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

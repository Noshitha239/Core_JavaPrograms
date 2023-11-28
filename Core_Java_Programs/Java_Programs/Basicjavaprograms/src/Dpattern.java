import java.util.Scanner;

public class Dpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<=a-1;i++) {
			for(int j=0;j<=a-1;j++) {
				if((i==0&&j<=(3*a/4))|| j==0 || ((j==a-1&&i<=3*a/4)&&(j==a-1&&i>=a/4))|| (j==((3*a/4)+1)&&i==(a/4)-1)|| (i==(3*a/4)+1&&j==(3*a/4)+1)||(i==(a-1)&&(j<=3*a/4))) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

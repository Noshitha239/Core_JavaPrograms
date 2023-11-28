import java.util.Scanner;

public class W2pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size: ");
		int a=sc.nextInt();
		for(int i=1;i<=a-1;i++) {
			for(int j=i;j<=a-1;j++) {
				if(i==0|| (j==0&&i<=a/2)||i+j==a/2) {
					System.out.print(" *");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

import java.util.Scanner;
public class wpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {  

			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			
			for(int j=2;j<=2*i-1;j++) {

				System.out.print(" ");
                
			}
			
			for(int j=n;j>=i;j--) {      

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
import java.util.Scanner;

public class Numers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++) {
        	int k=i;
        	for(int j=0;j<n;j++) {
        		if(k<10) {
        			System.out.print("0"+k);
        		}else {
        		System.out.print(k+"");}
        		System.out.print("  ");
        		k=k+5;
        	}System.out.println();
        }System.out.println();
	}

}

import java.util.Scanner;

public class Challengestoday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n size: ");
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++) {
        	for(int j=0;j<n;j++) {
        		
        		System.out.print(count+"");
        		System.out.print("  ");
        		count=count+2;
        		
        	}System.out.println();
        }System.out.println();
        
        
        
        //
       
        
	}

}


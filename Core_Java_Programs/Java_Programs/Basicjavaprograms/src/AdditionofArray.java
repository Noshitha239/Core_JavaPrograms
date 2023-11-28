import java.util.Scanner;

public class AdditionofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a1[][]=new int[n][m];
        int a2[][]=new int[n][m];
        int a3[][]=new int[n][m];
        System.out.println("Enter first array values: "+n);
        for(int i=0;i<a1.length;i++) {
        	for(int j=0;j<a1[i].length;j++) {
        	a1[i][j]=sc.nextInt();
        	}
            }
             System.out.println("Enter second array values: "+n);
        	 for(int i=0;i<a2.length;i++) {
        		 
             	for(int j=0;j<a2[i].length;j++) {
             	a2[i][j]=sc.nextInt();
             	}
        	 }
        	 for(int i=0;i<a1.length;i++) {
             	for(int j=0;j<a1[i].length;j++) {
             	a3[i][j]=a1[i][j]+a2[i][j];
             	}
        	 }
       
        	 for(int i=0;i<a3.length;i++) {
             	for(int j=0;j<a3[i].length;j++) {
             		 System.out.println("Enter sum of two arrays: "+a3[i][j]);
             	}
        //adding two arrays values
       
       
	}

}
}

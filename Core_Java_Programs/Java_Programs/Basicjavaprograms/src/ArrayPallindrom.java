import java.util.Scanner;

public class ArrayPallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of an array: ");
	        int n=sc.nextInt();
	        int a1[]=new int[n];
	        int a2[]=new int[n];
	        for(int i=0;i<a1.length;i++) {
	        	a1[i]=sc.nextInt();
	        }
	        int flag=0;
	        int temp=0;
	        for(int i=n-1;i>=0;i--) {
	        	a2[temp]=a1[i];
	        	temp++;
	        }
	        for(int i=0;i<a1.length;i++) {
	        	if(a1[i]!=a2[i]) {
	        		flag=1;
	        		break;
	        	}
	        }
	        if(flag==1) {
	        	System.out.println("Array is not equal");
	        }
	        else {
	        	System.out.println("Array is equal");
	        }
	}

}

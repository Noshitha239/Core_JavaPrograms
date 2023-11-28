package LeetCode;
import java.util.Scanner;
public class RotateArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the k value: ");
		int k=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
		}   
        for(int i = 0; i < k; i++){    
            int l;     
            l = a[a.length-1]; 
            for(int j = a.length-1;j > 0; j--){      
                a[j] = a[j-1];  
                for(int m=0;m<a.length;m++){
                	System.out.print(a[m]+" ");
                }
                System.out.println();
            }
            a[0] = l;    
        }    
        System.out.println();        
        for(int i = 0; i< a.length; i++){    
            System.out.print(a[i] + " ");    
        }    
    }    
}    


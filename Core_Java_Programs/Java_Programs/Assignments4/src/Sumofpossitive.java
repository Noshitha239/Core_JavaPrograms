import java.util.*;
public class Sumofpossitive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
        	a[i]=sc.nextInt();
        }
        int sum=0;
        int temp;
        for(int i=0;i<a.length;i++){
        	if(a[i]>0){
        		temp=a[i];
        		sum=sum+temp;
        	}
        }   
        System.out.println(sum);
        if(sum/2==0||sum%2==1){
        	System.out.println("The given number is perfect square root");
        }
        else{
        	System.out.println("The given number is not a perfect square root");
        }
	}   
}


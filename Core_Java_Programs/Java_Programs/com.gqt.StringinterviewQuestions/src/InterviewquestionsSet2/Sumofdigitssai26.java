//26.find the sum of the digits of a number
package InterviewquestionsSet2;
import java.util.*;

public class Sumofdigitssai26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
//		int n1=sc.nextInt();
//		int a[]=new int[n];
//		for(int i=1;i<a.length;i++){
//			a[i]=sc.nextInt();
//			if(a[i]>=0){
//				n1=n1+a[i];
//        	}
//        }
//		System.out.println(n1);
//	}
        int sum=0,temp=0;
        while(n>0) {
        	temp=n%10;
        	n=n/10;
        	sum=sum+temp;
        }
        System.out.println(sum);

}
}

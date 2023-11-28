//4.print 1 to n numbers using foreach loop

package Practice20set2;
import java.util.*;
public class Print1tonforeach4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        int n1[]=new int[n];
        for(int i=0;i<n1.length;i++) {
        	n1[i]=sc.nextInt();
        }
        for(int n2:n1) {
        	System.out.println(n2);
        }
	}

}

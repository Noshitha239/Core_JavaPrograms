//16.find the most repeated word in a sentence.
package Practice20set2;
import java.util.*;
public class Findmostrepeatedword16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n =sc.nextInt();
		System.out.println("enter the string:");
		String arr[] = new String[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		int freq = 0;
		String res = "";
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if (count >= freq) {
				res = arr[i];
				freq = count;
			}
		}
		System.out.println("The Repeated word: " + res);
	}
}

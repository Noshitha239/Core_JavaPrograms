//25.Consider the number of elements in nums which are not equal to val be k, to get
//accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the elements
//which are not equal to val. The remaining elements of nums are not important as well
//as the size of nums.
//Return k.
//Example
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,,]
package InterviewquestionsSet2;
import java.util.Scanner;
public class removequalvalueprintCount25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the size of an array:");
		int n=sc.nextInt();
		int[] arr = new int[n];
        int[] arr1=new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the Element to Remove: ");
		int val = sc.nextInt();
		int j=0;
		int count=0;
		for(int i=0; i<n; i++)
		{
			if(val!=arr[i])
			{
//				for(int j=i; j<(n-1); j++)
//					arr[j] = arr[j+1];
//
//				break;
				arr1[j]=arr[i];
				j++;
				count++;
			}
		}
		System.out.println("count:"+count);
		for(int k=0; k<j; k++)
			
			System.out.print(arr1[k]+ " ");	
		
	}

}

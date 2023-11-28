//19) Selection of MPCS exams include a fitness test which is conducted on 
//ground. There will be a batch of 3 trainees, appearing for running test 
//in track for 3 rounds. You need to record their oxygen level after every 
//round. After trainee are finished with all rounds, calculate for each 
//trainee his average oxygen level over the 3 rounds and select one with 
//highest oxygen level as the most fit trainee. If more than one trainee 
//attains the same highest average level, they all need to be selected.
package Practice20set1;
import java.util.*;
public class MPCS19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of traines");
		int traines=sc.nextInt();
		System.out.println("enter number of rounds");
		int rounds=sc.nextInt();
		int mat[][]=new int[rounds][traines];
		for(int i=0;i<rounds;i++) {
			for(int j=0;j<traines;j++) {
				mat[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<rounds;i++) {
			for(int j=0;j<traines;j++) {
				System.out.print(mat[i][j]+" ");
			}System.out.println();
		}
		int averages[]=new int[traines];
		int count=0;
		for(int i=0;i<rounds;i++) {
			int sum=0;
			for(int l=0;l<traines;l++) {
				for(int j=0;j<traines;j++) {
					if(j==l) {
						sum+=mat[j][i];
					}
				}
			}
			averages[count]=sum;
			System.out.println(averages[count]);
			count++;
		}
		int max=0;
		for(int i=0;i<averages.length;i++) {
			if(averages[i]>=max) {
				max=averages[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<averages.length;i++) {
			if(averages[i]>=max)
				System.out.println("traine"+(i+1));
		}
	}


}




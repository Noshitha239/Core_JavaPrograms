import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of students: ");
        int n=sc.nextInt();
        int a[]=new int[5];
        //Adding data into the array
        for(int i=0;i<a.length;i++) {
        	System.out.println("Enter the marks of student no: "+(i+1));
        	a[i]=sc.nextInt();
        }
        //Printing the scores
        for(int i=0;i<a.length;i++) {
        	System.out.println("the marks of student no: "+(i+1)+"is:"+(a[i]));
        }
	}

}

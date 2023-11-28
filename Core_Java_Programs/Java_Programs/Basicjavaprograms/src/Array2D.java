import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class count: ");
		int cls=sc.nextInt();
		String a[][]=new String[cls][];
		//2D Jagged Aarray
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the student count inside the class: "+(i+1));
			a[i]=new String[sc.nextInt()];
		}
		//Adding data into the array
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the name of the student no: "+(j+1));
				a[i][j]=sc.next();
			}
		}
		//Displaying student names
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside class"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("the name of student no: "+(j+1)+"is:"+(a[i][j]));
			}
		}

	}

}

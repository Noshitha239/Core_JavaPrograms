import java.util.Scanner;

public class Array4D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of universities: ");
		int University=sc.nextInt();
		System.out.println("Enter number of colleges: ");
		int college=sc.nextInt();
		System.out.println("Enter number of classes: ");
		int clss=sc.nextInt();
		System.out.println("Enter number of students: ");
		int Stu=sc.nextInt();
		
		String a[][][][]=new String[University][college][clss][Stu];
		
		//Adding data into the array
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside University no: "+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside College no: "+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Inside Class no: "+(k+1));
					for(int l=0;l<a[i][j][k].length;l++) {
						System.out.println("Enter the Student name: "+(l+1));
						
					    a[i][j][k][l]=sc.next();
				}
			}
		}
		}
		//Displaying student names
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside University no: "+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside College no: "+(j+1)+a[i]);
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Inside Class no: "+(k+1)+a[i][j]);
					for(int l=0;l<a[i][j][k].length;l++) {
						System.out.println("Enter the Student name: "+(l+1)+a[i][j][k][l]);
					}
				}
			}
		}

	}
}


import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of languages: ");
		int lan=sc.nextInt();
		System.out.println("Enter number of geners: ");
		int gener=sc.nextInt();
		System.out.println("Enter number of movies: ");
		int movie=sc.nextInt();
		String a[][][]=new String[lan][gener][movie];
		
		//Adding data into the array
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside language no: "+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside the type no: "+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter the movie name: "+(k+1));
					a[i][j][k]=sc.next();
				}
			}
		}
		//Displaying student names
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside language: "+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside type no: "+(j+1)+"is:"+(a[i][j]));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter the movie name: "+(k+1)+"is"+a[i][j][k]);
				}
			}
		}

	}



}



import java.util.Scanner;
import java.util.InputMismatchException;
public class Trywithmultiplecatch {
     public static void main(String args[]) {
    	 try{
    		 Scanner sc=new Scanner(System.in);
    		 System.out.println("Enter the numerator:");
    		 int numerator=sc.nextInt();
    		 System.out.println("Enter the denominator:");
    		 int denominator=sc.nextInt();
    		 int r=numerator/denominator;
    		 System.out.println(r);
    		 System.out.println("Enter the array size:");
    		 int size=sc.nextInt();
    		 int arr[]=new int[size];
    		 System.out.println("Enter the value to be added: ");
    		 int value=sc.nextInt();
    		 System.out.println("Enter the position to add the value: ");
    		 int position=sc.nextInt();
    		 arr[position]=value;
    		 System.out.println("Value Added: ");
    	 }
    	 catch(ArithmeticException e) {
    		 System.out.println("Divide by 0 is not permited");
    	 }
    	 catch(InputMismatchException e1) {
    		 System.out.println("Check the data entered");
    	 }
    	 catch(NegativeArraySizeException e2) {
    		 System.out.println("Array size cannot be negative ");
    	 }
    	 catch(NullPointerException e3) {
    		 System.out.println("Cannot have null value");
    	 }
    	 catch(ArrayIndexOutOfBoundsException e4) {
    		 System.out.println("specified index is not available");
    	 }
    	 catch(Exception e) {
    		 System.out.println("Exception handled by generic catch");
    	 }	 
    	 }
}

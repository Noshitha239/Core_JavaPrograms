package com.gqt.calculatorApp;

import java.util.Scanner;

public class CalculatorApplication {
	public static int n1;
	public static int n2;
	public static void CollectInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number: ");
		n1=sc.nextInt();
		System.out.println("Enter the Second number: ");
		n2=sc.nextInt(); 
	}
	public static void main(String []args) {     
		Scanner sc=new Scanner(System.in);
		System.out.println("\t \t Welcome to the calculator");
		System.out.println();
		System.out.println("Please select the operation to be performed :\n"+"1. Addition operation\n"
				+"2. Subtraction operation\n"
				+"3. Multiplication operation\n"
				+"4. Division operation\n"
				+"5. Modulus operation\n"
				+"6. Exit\n"
				+"7. Restart\n");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Addition Operation\n");
			CollectInput();
			System.out.println("The result of Addition is:"+(n1+n2));
			break;
		}
		case 2:{
			System.out.println("Subtraction Operation\n");
			CollectInput();
			System.out.println("The result of Subtraction is:"+ (n1-n2));
			break;
		}
		case 3:{
			System.out.println("Multiplication Operation\n");
			CollectInput();
			System.out.println("The result of Multiplication is:"+(n1*n2));
			break;
		}
		case 4:{
			System.out.println("Division Operation\n");
			CollectInput();
			System.out.println("The result of division is:"+(n1/n2));
			break;
		}
		case 5:{
			System.out.println("Modulus Operation\n");
			CollectInput();
			System.out.println("The result of Modulus is:"+(n1%n2));
			break;
		}
		case 6:{
			System.out.println("Thank you");
			System.exit(0);
		}
		case 7:{
			main(null);
		}
		default:
			System.out.println("This is not a valid input please try again...");
			main(null);

		}	
		main(null);
	}

}


